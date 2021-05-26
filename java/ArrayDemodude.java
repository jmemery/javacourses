import java.util.Scanner;   

/**
   This program asks for sales inputs from emplyees 
   and returns a tabular display and gives feedback
   Jase Emery 
   CS1A Foothill 
   Assignment 6
*/

public class ArrayDemodude
{ 
public enum Sale {
    GREAT,
    GOOD,
    OK,
    BAD;  
  }
   public static void main(String[] args)
   {
      final int SALES1 = 1000;           // Number of employees
      int[] sales = new int[SALES1];  // Array of sales
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Enter your sales. NEGATIVE TO END");
      // Create a Scanner object for keyboard input.
    for (int index = 0; index < SALES1; index++){
      System.out.print("Sale " + (index + 1) + ": ");
      sales[index] = keyboard.nextInt();
      if (sales[index] <0){
          break;
      }
    }
    int count1 = 0; //200-299
    int count2 = 0; //300-399
    int count3 = 0; //400-499
    int count4 = 0; //500-599
    int count5 = 0; //600-699
    int count6 = 0; //700-799
    int count7 = 0; //800-899
    int count8 = 0; //900-999
    int count9 = 0; //1000+
      // Display the values entered.
      for (int index = 0; index < SALES1; index++){
      //System.out.println(sales[index]);

      if (sales[index] >= 200 && sales[index] <= 299) {
          count1++;
      }
      if (sales[index] >= 300 && sales[index] <= 399) {
          count2++;
      }
      if (sales[index] >= 400 && sales[index] <= 499) {
          count3++;
      }
      if (sales[index] >= 500 && sales[index] <= 599) {
          count4++;
      }
      if (sales[index] >= 600 && sales[index] <= 699) {
          count5++;
      }
      if (sales[index] >= 700 && sales[index] <= 799) {
          count6++;
      }
      if (sales[index] >= 800 && sales[index] <= 899) {
          count7++;
      }
      if (sales[index] >= 900 && sales[index] <= 999) {
          count8++;
      }
      if (sales[index] >= 1000) {
          count9++;
      }
     }
    System.out.println("Range                Number");
    System.out.println("$200-299             " + count1);
    System.out.println("$300-399             " + count2);
    System.out.println("$400-499             " + count3);
    System.out.println("$500-599             " + count4);
    System.out.println("$600-699             " + count5);
    System.out.println("$700-799             " + count6);
    System.out.println("$800-899             " + count7);
    System.out.println("$900-999             " + count8);
    System.out.println("$1000 and over       " + count9);
    if (count9 > 0 || count8 >0 || count7 >0){
        System.out.println("You had some great sales this month!!");
        Sale a1 = Sale.GREAT;
        System.out.println(a1);
    }
    else if (count4 > 0 || count5 >0 || count6 >0){
        Sale b1 = Sale.GOOD;
        System.out.println(b1);
    }
    else if (count1 + count2 + count3 + count4 + count4 + 
        count6 + count7 + count8 + count9 > 3000){
        Sale c1 = Sale.OK;
        System.out.println(c1);
    }
    else if (count1 + count2 + count3 + count4 + count4 + 
    count6 + count7 + count8 + count9 < 1000){
        Sale d1 = Sale.BAD;
    System.out.println(d1);
    }
   }
}  
/**
 *********************RUN*******************

 **/
