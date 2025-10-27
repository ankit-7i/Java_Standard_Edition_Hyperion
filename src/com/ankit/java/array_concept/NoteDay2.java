package com.ankit.java.array_concept;

public class NoteDay2 {

    /*
    Category Of Array
==================

-> Generally we are categorising array into 2 part to get proper understanding of array.
A) Primitive array
B) reference array



A) Primitive Type Array :
----------------------

1) int a[];      // used to store integer type values

2) float f[];    // used to store floating type vlaues

3) double d[];   // used to store double type values

4) char c[];     // used to store character type values

5) boolean b[];  // used to store double values(TRUE/FALSE)

6) byte b[];     // used to store byte values

7) short b[];    // used to store short values

8) long l[];     // used to store long values



B) Refrence Type / Object Type / Class Type :
------------------------------------------------

1) Object type array :-> Object obj[]; // Object type array is used to store all types of values...[HETROGENEOUS ARRAY]

2) Class Type array :-> Student s[]; OR Employee e[]; OR NareshIt n[]; .... so on. // used to store perticular class type object only.[HOMOGENEOUS ARRAY]

3) Abstract Class Type of array : -> // used to store child-class objects [loosed coupled + HETROGENEOUS ARRAY for child classes + HOMOGENEOUS ARRAY for non child classes]

4) Interface Type Array :-> // used to store implementation class objects [loosed coupled + HETROGENEOUS ARRAY for implementation classes + HOMOGENEOUS ARRAY for non implementation classes]


NOTE : USING OBJECT TYPE ARRAY WE CAN STORE HOMOGENEOUS / HETROGENEOUS TYPES OF ELEMENTS INTO THE ARRAY.
       AND THATS WHY WE CAN SAY OBJECT ARRAY IS HETROGENEOUS ARRAY IN JAVA.

Example : Object obj[] = {123,"java",10.0,'A',true};

#############################################################


Types Of Array:
================
In Java, Basically there are two types of arrays:

1) Single OR One Dimensional Array.
2) 2D Array / Multi-Dimensional Array / Jagged array

-----------------------------------------------------------------------
Working with single OR one Dimensional Array :
----------------------------------------------
In Java we can create single dimensional array by using following ways :

1) Using new keyword
2) Using literal
3) Using Anonymous array

Example 1 :
-----------
The most common way to create an array by using new keyword :

Example :
           int[] arr = new int[5];
	   Student[] students = new Student[10];
Note : Here the array memory locations will be initialized with default
       value.


Example 2 :
-----------
Another way to create an array object using Using literal.
[We can initialize the array directly while creating it.]

Example :
          int[] arr = new int[]{10, 20, 30, 40, 50};

Note : Here instead of default value user provides the value explicitly.


In the above example, expression is duplicate because the type of array we know from the left side of equal sign and since we are specifying the value of array hence we know the size also.

Instead of this we can use more convenient way which is known as Anonymous array.

Example 3 :
-----------
             int[] arr = {100, 200, 300};
Note : This is called anonymous array becuase we don't specify type and size.

Finally, We can use [] before or after the name, providing space is optional. The following 5 statements are same

int[]  num1;
int [] num2;
int  []num3;
int num4[];
int num5 [];

################################################################

NOTE :
      -> When we are creating array objects then JVM will treat like special object .
      -> before creating array object in Heap memory jvm will create internal class and load the class.
      -> once the class is created and loaded then jvm will create array object inside the heap memory.
      -> also JVM is creating internal class for array objects based on type signature(type of array) with some names like below example.

      -> Example 1 :
                  int arr[]=new int[10]; //primitive array
		  System.out.println("Class Name = "+arr.getClass().getName());// Class Name = [I

      -> Example 2 :
                    Integer arr[]=new Integer[10]; // reference array
                    System.out.println("Class Name = "+arr.getClass().getName()); // Class Name = [Ljava.lang.Integer;

      -> Follow the bellow diagram JNI Diagram for class naming.


################################################################


1) Working With Pimitive type (int array) :
============================================

Example 1 : [Using Anonymous Array]
---------------------------
import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

//		  APPROACH - 1 (Iterating array using for loop)
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

//		  APPROACH - 2 (Iterating array using for-each loop)
		for (int i : arr)
			System.out.print(i + " ");

//		  APPROACH - 3 (Printing array using Arrays.toString() method)
		System.out.println(Arrays.toString(arr));

	}
}

-------------------------------------------------------

Example 2 : [Using new keyword]
--------------------------------

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
//		 Array using new keyword
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter " + size + " Integer elements int array");

//      reading elements and storing into the array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

//		  APPROACH - 1 (Iterating array using for loop)
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

//		  APPROACH - 2 (Iterating array using for-each loop)
		for (int i : arr)
			System.out.print(i + " ");

//		  APPROACH - 3 (Printing array using Arrays.toString() method)
		System.out.println(Arrays.toString(arr));

	}
}

###########################################################

2) Working with Object type :
==============================

Example 1 : [Using Anonymous Array]
-----------------------------------

import java.util.Arrays;

class Employee {
	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}

public class ArrayDemo {

	public static void main(String[] args) {

		Object arr[] = { 1, 10.5, "java", true, 'A', new Employee(1, "raj"), 2, 3, 4 };

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		for (Object obj : arr)
			System.out.println(obj);

		System.out.println(Arrays.toString(arr));

		int sum = 0;

		for (Object o : arr) {
			if (o instanceof Integer) {
				sum = sum + (int) o;
			}
		}
		System.out.println(sum);
	}

}


NOTE :
-> if array is homogeneous array then we can store values dynamically into array.
-> if array is heterogeneous then we can not store value dynamically into the array.
-> and Using new keyword we can just create object type array/heterogeneous array but we can not store values dynamically.
-> using braces is best choice to create and store values into heterogeneous array.


###########################################################

3) Working with class type array :
===================================

Example 1 : [using Anonymous array]
------------------------------------

package com.nit.day1;

import java.util.Arrays;

class Employee {

	int eid;
	String ename;
	double esal;

	public Employee(int eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public String toString() {
		return "Empid = " + eid + " Empname = " + ename + " EmpSal = " + esal;

	}

public class ArrayDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "raj", 10000);

		Employee e2 = new Employee(2, "rahul", 20000);

		Employee e3 = new Employee(3, "suraj", 30000);

		Employee arr[] = { e1, e2, e3, new Employee(4, "juber", 40000) };

//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

//		for (Employee s : arr) {
//			System.out.println(s);
//		}

		System.out.println(Arrays.toString(arr));
	}
}
-------------------------------------

Example 2 : [Using new keyword]
--------------------------------

package com.nit.day1;

import java.util.Arrays;
import java.util.Scanner;

class Employee {

	int eid;
	String ename;
	double esal;

	public Employee(int eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public String toString() {
		return "Empid = " + eid + " Empname = " + ename + " EmpSal = " + esal;

	}
}

public class ArrayDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		Employee arr[] = new Employee[size];

//      reading elements and storing into the array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("<=== Enter " + (i + 1) + " record of Employee ===>");
			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter salary");
			double sal = sc.nextDouble();
			arr[i] = new Employee(id, name, sal);
		}

//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

//		for (Employee s : arr) {
//			System.out.println(s);
//		}

		System.out.println(Arrays.toString(arr));
	}
}


###########################################################

4) Working with Abstract class type :
=======================================

Example 1 :
-----------

package com.arrayday1;

import java.util.Arrays;

abstract class Shape { }

class Square extends Shape { }

class Circle extends Shape { }

public class ArrayDemo {

	public static void main(String[] args) {

		Shape arr[] = new Shape[2];
		arr[0] = new Square();
		arr[1] = new Circle();
		System.out.println(Arrays.toString(arr));
	}
}

NOTE :
-> if array is homogeneous array then we can store values dynamically into array.
-> if array is heterogeneous then we can not store value dynamically into the array.
-> and Using new keyword we can just create object type array/heterogeneous array but we can not store values dynamically.
-> using braces is best choice to create and store values into heterogeneous array.


###########################################################

5) Working with Interface type :
=================================

Example 1 :
-----------

package com.arrayday1;

import java.util.Arrays;

interface Shape { }

class Square implements Shape { }

class Circle implements Shape { }

public class ArrayDemo {

	public static void main(String[] args) {

		Shape arr[] = new Shape[2];
		arr[0] = new Square();
		arr[1] = new Circle();
		System.out.println(Arrays.toString(arr));
	}
}

NOTE :
-> if array is homogeneous array then we can store values dynamically into array.
-> if array is heterogeneous then we can not store value dynamically into the array.
-> and Using new keyword we can just create object type array/heterogeneous array but we can not store values dynamically.
-> using braces is best choice to create and store values into heterogeneous array.






     */
}
