import java.util.Scanner;

public class Salary {                         
   public static void main (String [] args) { 
      double wage;  
      Scanner scnr = new Scanner(System.in);

      boolean quit = false;

      while (quit == false) {
         wage = scnr.nextDouble();

         if (wage <= 0) {
            quit = true;
            System.out.println("Input your dog's age in human years.");
            System.out.println("Input a number less than or equal to 0 to quit.");
            break;
         }

         else {
            System.out.print("Your salary before taxes is ");         
            System.out.print(wage * 40 * 52); 
            System.out.println("."); 
         }
      }         
   } 
}
