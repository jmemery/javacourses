/**
   This program demonstrates the Dog class's
   constructor.
*/

public class DogDemo
{
   public static void main(String[] args)
   {
      // Create a Dog object, passing 5.0 and
      // 15.0 as arguments to the constructor.
      Dog boxer = new Dog(5.0, 15.0);

      // Display the length.
      System.out.println("The box's length is " +
                         boxer.getDogName1());

      // Display the width.
      System.out.println("The box's width is " +
                         boxer.getOwnerName1());

      // Display the area.
      System.out.println("The box's area is " +
                         boxer.getDogAge1());
   }
}
