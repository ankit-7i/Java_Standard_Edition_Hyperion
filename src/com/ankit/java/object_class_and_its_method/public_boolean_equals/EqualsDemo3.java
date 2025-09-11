package com.ankit.java.object_class_and_its_method.public_boolean_equals;

class Manager {
    private int id;
    private String name;

    public Manager(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Manager) {   // ✅ ensures safe comparison
            Manager m2 = (Manager) obj;

            if (this.id == m2.id && this.name.equals(m2.name)) {
                return true;
            } else {
                return false;
            }
        } else {
            System.err.println("Comparison is not possible");
            return false;
        }
    }
}

class Customer {
    private int cid;
    private String cname;

    public Customer(int cid, String cname) {
        super();
        this.cid = cid;
        this.cname = cname;
    }
}

public class EqualsDemo3 {
    public static void main(String[] args) {
        Manager m1 = new Manager(101, "Scott");
        Manager m2 = new Manager(101, "Scott");

        System.out.println(m1.equals(m2));  // true → same type, same data

        System.out.println("---------------");

        Customer c1 = new Customer(101, "Scott");

        System.out.println(m1.equals(c1));  // false → different class
    }
}

