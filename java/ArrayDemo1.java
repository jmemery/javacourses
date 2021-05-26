import java.util.Scanner;   // Needed for Scanner class

/**
   This program shows values being stored in an array's
   elements and displayed.
*/

public class ArrayDemodude
{
   public static void main(String[] args)
   {
      final int SALES1 = 3;           // Number of employees
      int[] sales = new int[SALES1];  // Array of sales
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter the sales by " +
                         EMPLOYEES + " employees.");
    for (int index = 0; index > 0; index++){
      // Get the sales
      System.out.print("Employee " + (index + 1) + ": ");
      sales[index] = keyboard.nextInt();
    }
      // Display the values entered.
      System.out.println("The sales you entered are:");
      System.out.println(sales[0]);
      System.out.println(sales[1]);
      System.out.println(sales[2]);
   }
}     