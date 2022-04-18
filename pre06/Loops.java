import java.io.*;
import java.util.*;

public class Loops{

public static void main(String[] args) {

  squareRoot(25.0);
  
}

  
/*methood for Exercise 2:
Write a method called squareRoot that takes a double and returns an approximation of the square root of the parameter, using this technique. You should not use Math.sqrt.
  */
public static void squareRoot(double a) {

  double x = a / 2.0;
  double y = (x + a / x) / 2.0;
  double d = (Math.abs(x-y));
  
  while (d > 0.0001) {
    System.out.print("I guessed the square root of " + a + " was "); 
    System.out.printf("%.3f", x); 
    System.out.println(" but I was wrong.");
    x = y;
    y = (x + a / x) / 2.0;
    d = (Math.abs(x-y));
  }
    
    System.out.print("The square root of " + a + " is ");
     System.out.printf("%.3f", x);
  

  
}
  }
  