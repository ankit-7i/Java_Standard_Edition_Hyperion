package com.ankit.java.introduction.variables.nonstaticvar;

public class RoleOfNonStaticvarForObjectCreation {
    int x =10;

    public static void main(String[] args) {
        RoleOfNonStaticvarForObjectCreation t1 =new RoleOfNonStaticvarForObjectCreation();
        RoleOfNonStaticvarForObjectCreation t2 = new RoleOfNonStaticvarForObjectCreation();
        ++t1.x;
        --t2.x;
        System.out.println(t1.x);
        System.out.println(t2.x);
    }
}
