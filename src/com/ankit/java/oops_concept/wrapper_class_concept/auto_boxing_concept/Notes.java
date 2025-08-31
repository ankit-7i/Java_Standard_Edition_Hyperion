package com.ankit.java.oops_concept.wrapper_class_concept.auto_boxing_concept;

public class Notes {
    /*
        Autoboxing in Java

🔹 Definition

Introduced in JDK 1.5.

It is used to convert primitive data types into their corresponding wrapper objects automatically.

Conversion Process

Autoboxing is internally done using the valueOf() static method of wrapper classes.

Primitive vs Wrapper Types
Primitive Type	Wrapper Object
byte	Byte
short	Short
int	Integer
long	Long
float	Float
double	Double
char	Character
boolean	Boolean
Before JDK 1.5 (Manual Conversion)

Java developers had to manually convert primitive types to wrapper objects.

int x = 10;

// Convert primitive into Wrapper object
Integer obj = Integer.valueOf(x);
System.out.println(obj);

From JDK 1.5 Onwards (Autoboxing)

The compiler automatically converts primitives to wrapper objects:

int x = 10;
Integer i = x;  // Internally compiler writes: Integer i = Integer.valueOf(x);
System.out.println(i);

Important Notes

All Wrapper Classes are immutable (cannot be changed).

equals(Object obj) and hashCode() methods are overridden in all wrapper classes.

⚡ So in short:
👉 Autoboxing = Automatic conversion from primitive → wrapper (done by compiler).

    **/
}
