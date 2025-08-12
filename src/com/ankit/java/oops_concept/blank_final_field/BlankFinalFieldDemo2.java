package com.ankit.java.oops_concept.blank_final_field;
/*
* Notes - Blank Final Field in Java
1. A final field must be initialized by the developer only once.

2. If a final non-static field is not initialized at the time of declaration,
   then it is called a "Blank Final Field".

3. Blank final fields are used to force the developer to provide a value for
   a non-static field, usually through a constructor.

4. A blank final field:
   - Cannot be initialized in the default no-argument constructor automatically.
   - Must be initialized in all constructors of the class if not initialized at declaration.
   - Cannot be assigned a value inside a method (other than constructors or instance initializer blocks).

5. Common usage:
   - For constants whose values are different for different objects.
   - For mandatory configuration parameters provided during object creation.

6. Compilation Rules:
   - If a blank final is not initialized before the object construction completes,
     the compiler will throw an error.
   - Assignments to blank finals are allowed only:
     a) At the point of declaration.
     b) In an instance initializer block.
     c) In the constructor of the class.

* **/
// Example 2: Blank Final Field initialization inside a method (Not allowed)

class LIC2 {
    //final double installment; // Blank final field

    public void getInstallment() {
       // installment = 20000.00; // Compilation error: cannot assign a value to final variable installment
    }
}

public class BlankFinalFieldDemo2 {
    public static void main(String[] args) {
        LIC l = new LIC();
        //l.getInstallment();
       // System.out.println(l.installment);
    }
}


