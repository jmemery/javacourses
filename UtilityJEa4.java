/*
John 'Jase' Emery
This program demonstrates a loop
CS1A Foothill 
*/

import java.util.Scanner; 

public class test1
{
   public static void main(String[] args)
   {
      int water_watts, water_hours, computer_watts, computer_hours, dryer_watts, dryer_hours; 
      double watt_tot;             
      double bill;
      char repeat;                 
      String input;               
      
      System.out.println("This program calculates your water bill");

      Scanner keyboard = new Scanner(System.in);
      do
      {
         System.out.print("How many watts for the water heater? ");
         water_watts = keyboard.nextInt();
         
         System.out.print("How many hours for the water heater? ");
         water_hours = keyboard.nextInt();
         
         System.out.print("How many watts for the computer? ");
         computer_watts = keyboard.nextInt();
         
         System.out.print("How many hours for the computer? ");
         computer_hours = keyboard.nextInt();
         
    
         System.out.print("How many watts for the dryer? ");
         dryer_watts = keyboard.nextInt();

         System.out.print("How many hours for the dryer? ");
         dryer_hours = keyboard.nextInt();
               
         keyboard.nextLine();

         watt_tot  = ((water_watts * water_hours) + 
         (computer_watts * computer_hours) 
         + (dryer_watts * dryer_hours));
         bill = watt_tot * .00005;
         System.out.println("You have used " + String.format("%.2f", watt_tot) + 
         " Watt-Hours of electricity.");
         System.out.println("Your total bill this month is " + String.format("%.2f", bill) );
         System.out.println();  

         System.out.println("Would you like to run another bill query?");
         System.out.print("Enter Y for yes or N for no: ");
         input = keyboard.nextLine();
         repeat = input.charAt(0);

      } while (repeat == 'Y' || repeat == 'y');
    }
}
/*
// ******************************************************RUN**************************************************************************8
jase@jase-desktop-ml:~$  cd /home/jase ; /usr/bin/env /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /home/jase/.config/Code/User/workspaceStorage/087b67ec678dc8ea7a8766c646bf1aea/redhat.java/jdt_ws/jdt.ls-java-project/bin test1 
This program calculates your water bill
How many watts for the water heater? 500000
How many hours for the water heater? 511
How many watts for the computer? 515
How many hours for the computer? 456
How many watts for the dryer? 4
How many hours for the dryer? 456
You have used 255736664.00 Watt-Hours of electricity.
Your total bill this month is 12786.83

Would you like to run another bill query?
Enter Y for yes or N for no: yes
How many watts for the water heater? 80
How many hours for the water heater? 87
How many watts for the computer? 78946
How many hours for the computer? 4
How many watts for the dryer? 4
How many hours for the dryer? 4
You have used 322760.00 Watt-Hours of electricity.
Your total bill this month is 16.14

Would you like to run another bill query?
Enter Y for yes or N for no: no
end
jase@jase-desktop-ml:~$ 
*/