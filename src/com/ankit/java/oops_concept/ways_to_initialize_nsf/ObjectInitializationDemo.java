package com.ankit.java.oops_concept.ways_to_initialize_nsf;

// Demonstration of Different Ways to Initialize Object Properties in Java
public class ObjectInitializationDemo {

    // ------------------ 1) At the time of declaration ------------------
    static class Test1 {
        int x = 10;
        int y = 20;

        @Override
        public String toString() {
            return "Test1 [x=" + x + ", y=" + y + "]";
        }
    }

    // ------------------ 2) Using Object Reference ------------------
    static class Test2 {
        int x, y;

        @Override
        public String toString() {
            return "Test2 [x=" + x + ", y=" + y + "]";
        }
    }

    // ------------------ 3) Using Methods ------------------

    // A) Method without parameters
    static class Test3A {
        int x, y;

        public void setData() {
            x = 100;
            y = 200;
        }

        @Override
        public String toString() {
            return "Test3A [x=" + x + ", y=" + y + "]";
        }
    }

    // B) Method with parameters
    static class Test3B {
        int x, y;

        public void setData(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Test3B [x=" + x + ", y=" + y + "]";
        }
    }

    // ------------------ 4) Using Constructor ------------------

    // A) No-argument constructor
    static class Test4A {
        int x, y;

        public Test4A() {
            x = 0;
            y = 0;
        }

        @Override
        public String toString() {
            return "Test4A [x=" + x + ", y=" + y + "]";
        }
    }

    // B) Parameterized constructor
    static class Test4B {
        int x, y;

        public Test4B(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Test4B [x=" + x + ", y=" + y + "]";
        }
    }

    // C) Copy constructor
    static class Employee {
        private int employeeId;
        private String employeeName;

        public Employee(int id, String name) {
            this.employeeId = id;
            this.employeeName = name;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public String getEmployeeName() {
            return employeeName;
        }
    }

    static class Manager {
        private int managerId;
        private String managerName;

        // Copy constructor
        public Manager(Employee emp) {
            this.managerId = emp.getEmployeeId();
            this.managerName = emp.getEmployeeName();
        }

        @Override
        public String toString() {
            return "Manager [managerId=" + managerId + ", managerName=" + managerName + "]";
        }
    }

    // ------------------ 4D) Instance Initializer Block ------------------
    static class Test4D {
        int x, y;

        {
            x = 100;
            y = 200;
        }

        public Test4D() {
            System.out.println("Inside Constructor: x=" + x + ", y=" + y);
        }

        @Override
        public String toString() {
            return "Test4D [x=" + x + ", y=" + y + "]";
        }
    }

    // ------------------ 5) Using super keyword ------------------
    static class SuperClass {
        int x, y;

        public SuperClass(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "SuperClass [x=" + x + ", y=" + y + "]";
        }
    }

    static class SubClass extends SuperClass {
        public SubClass() {
            super(100, 200); // Initializing superclass properties
        }
    }

    // ------------------ Main method ------------------
    public static void main(String[] args) {

        System.out.println("1) At the time of declaration:");
        Test1 t1a = new Test1();
        Test1 t1b = new Test1();
        System.out.println(t1a);
        System.out.println(t1b);

        System.out.println("\n2) Using Object Reference:");
        Test2 t2a = new Test2();
        t2a.x = 10;
        t2a.y = 20;
        Test2 t2b = new Test2();
        t2b.x = 30;
        t2b.y = 40;
        System.out.println(t2a);
        System.out.println(t2b);

        System.out.println("\n3A) Using Method without parameters:");
        Test3A t3a1 = new Test3A();
        Test3A t3a2 = new Test3A();
        t3a1.setData();
        t3a2.setData();
        System.out.println(t3a1);
        System.out.println(t3a2);

        System.out.println("\n3B) Using Method with parameters:");
        Test3B t3b1 = new Test3B();
        Test3B t3b2 = new Test3B();
        t3b1.setData(12, 78);
        t3b2.setData(15, 29);
        System.out.println(t3b1);
        System.out.println(t3b2);

        System.out.println("\n4A) Constructor (No-argument):");
        Test4A t4a1 = new Test4A();
        Test4A t4a2 = new Test4A();
        System.out.println(t4a1);
        System.out.println(t4a2);

        System.out.println("\n4B) Constructor (Parameterized):");
        Test4B t4b1 = new Test4B(12, 78);
        Test4B t4b2 = new Test4B(15, 29);
        System.out.println(t4b1);
        System.out.println(t4b2);

        System.out.println("\n4C) Constructor (Copy Constructor):");
        Employee emp = new Employee(101, "John");
        Manager mgr = new Manager(emp);
        System.out.println(mgr);

        System.out.println("\n4D) Instance Initializer Block:");
        Test4D t4d1 = new Test4D();
        System.out.println(t4d1);

        System.out.println("\n5) Using super keyword:");
        SubClass sub = new SubClass();
        System.out.println(sub);
    }
}

