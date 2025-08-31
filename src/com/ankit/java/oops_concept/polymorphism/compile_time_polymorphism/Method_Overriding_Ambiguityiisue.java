package com.ankit.java.oops_concept.polymorphism.compile_time_polymorphism;

public class Method_Overriding_Ambiguityiisue {
    /*
    Ambiguity Issue While Overloading a Method

When we overload a method, the compiler selects the appropriate method among the available ones based on the following factors:

Different number of parameters

Different data type of parameters

Different sequence (order) of data type of parameters

In case of ambiguity (when compiler can select more than one method), the compiler provides priority using the following rules:
1) Most Specific Type

Compiler always gives more priority to the most specific data type or class type.

Example of priority order:

double > float   [Here float is more specific than double]
float > long
long > int
int > char
int > short   // No relation between short and char
short > byte

2) WAV (Widening → Autoboxing → Var Args)

Compiler selects methods by following this sequence of preference:

Widening → Autoboxing → Var Args

3) Nearest Data Type or Nearest Class (Subclass)

While selecting the appropriate method in an ambiguous case, the compiler provides priority to the nearest data type or the nearest class (i.e., subclass).
     */
}
