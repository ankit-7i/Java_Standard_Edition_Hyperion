package com.java.collection_framework.collection.vector.concurrent_modification_exception;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

record Player(Integer id, String name, Double basePrice) { }

class IPLTeam {

    private String teamName;
    private List<Player> listOfPlayers;

    public IPLTeam(String teamName) {
        this.teamName = teamName;
        listOfPlayers = new Vector<Player>();  // Composition
    }

    public void addPlayer(Player player) {
        listOfPlayers.add(player);
    }

    public void displayAllPlayers() {
        System.out.println("List of players in \"" + teamName + "\" team:");
        listOfPlayers.forEach(System.out::println);
    }

    public void removePlayersBasedOnPrice() {
        // Logic 1: Using for-each loop to remove players with price > 5000
        for (Player player : listOfPlayers) {
            if (player.basePrice() > 5000) {
                listOfPlayers.remove(player);
                break;  // To avoid ConcurrentModificationException
            }
        }

        // Logic 2: Using Iterator (proper way)
        Iterator<Player> iterator = listOfPlayers.iterator();
        while (iterator.hasNext()) {
            Player player = iterator.next();
            if (player.basePrice() > 5000) {
                iterator.remove();
            }
        }
    }
}

public class VectorDemo {
    public static void main(String[] args) {

        IPLTeam team = new IPLTeam("RCB");

        team.addPlayer(new Player(101, "Virat Kohli", 4500.0));
        team.addPlayer(new Player(102, "Maxwell", 8000.0));
        team.addPlayer(new Player(103, "Faf Du Plessis", 7000.0));
        team.addPlayer(new Player(104, "Siraj", 3000.0));

        team.displayAllPlayers();

        System.out.println("\nAfter removing expensive players (price > 5000):");
        team.removePlayersBasedOnPrice();
        team.displayAllPlayers();
    }
}
