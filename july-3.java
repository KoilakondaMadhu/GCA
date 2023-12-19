
// java is oop language
// java is paltform independent language 
// it has classes 
// every student have different roll and every teacher have different id
// how many types of construtor ?
// 3 types 
// A constructor is similar to method and it is invoked at the time creating an object of the class, it is generally used to initialize the instance variables of a class. The constructors have same name as their class and, have no return type.

// There are two types of constructors parameterized constructors and no-arg constructors.

// Parameterized constructors
// A parameterized constructor accepts parameters with which you can initialize the instance variables. Using parameterized constructor, you can initialize the class variables dynamically at the time of instantiating the class with distinct values.

// Example
// Live Demo

import java.util.Scanner;
public class Test {
   int num;
   String data;
   float flt;
   Test(int num, String data, float flt){
      this.num = num;
      this.data = data;
      this.flt = flt;
   }
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter an integer value: ");
      int num = sc.nextInt();
      System.out.println("Enter a string value: ");
      String data = sc.next();
      System.out.println("Enter a floating point value: ");
      float flt = sc.nextFloat();      
      Test obj = new Test(num, data, flt);
      System.out.println(obj.num);
      System.out.println(obj.data);
      System.out.println(obj.flt);

   }
// }
// Output
// Enter an integer value:
// 1024
// Enter a string value:
// test
// Enter a floating point value:
// 11.2
// 1024
// test
// 11.2
// No-arg constructor
// A no-arg constructor doesn’t accepts any parameters, it instantiates the class variables with their respective default values (i.e. null for objects, 0.0 for float and double, false for Boolean, 0 for byte, short, int and, long).

// Example
// Live Demo

public class Test {
   int num;
   String data;
   float flt;
   Test(){
      this.num = 100;
      this.data = "test";
      this.flt = 125.33f;
   }
   public static void main(String args[]){  
      Test obj = new Test();
      System.out.println(obj.num);
      System.out.println(obj.data);
      System.out.println(obj.flt);
   }
// }
// Output
// 100
// test
// 125.33



// LINK 
// https://www.tutorialspoint.com/how-many-types-of-constructors-are-there-in-java#:~:text=There%20are%20two%20types%20of,constructors%20and%20no%2Darg%20constructors.
// Maruthi Krishna
// Maruthi Krishna

// How many types of JDBC Drivers are there?
// How many types of Third-Party Risks are there?
// How many types of Result Sets are there in JDBC What are they?
// How many non-access modifiers are there in Java?
// How many types of anonymous inner classes are defined in Java?
// How many ways are there to register a driver in Java?
