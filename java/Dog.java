/**
   Rectangle class, phase 5
*/

public class Dog
{
    private String dogName;
    private String ownerName;
    private double weight;
    private int age;

    static final int MIN_LEN = 1;
    static final int MAX_LEN = 20;
    static final String DEFAULT_STRING = "(undefined)";
    static final double DEFAULT_WEIGHT = 0.0;
    static final int DEFAULT_AGE = 0;
    static final double MAX_WEIGHT = 200.0;
    static final int MAX_AGE = 20;

  
      /** Constructor
    @param dogN = dogName;
    @param ownerN = ownerName;
    @param wei = weight;
    @param ag = age;
    */

   public Dog(String dogN, String ownerN, double wei, int ag)
   {
      dogName = dogN;
      ownerName = ownerN;
      weight = wei;
      age = ag;
   }
   /**
      The getLength method returns a Rectangle
      object's length.
      @param dogN The value in the length field.
   */
   public void setDogName1(string dogN)
   {
      dogName = dogN.substing(1, 20);
   }


  /**
     The getLength method returns a Rectangle
     object's length.
     @param ownerN The value in the length field.
  */
  public void setOwnerName1(string ownerN)
  {
     ownerName = ownerN.substing(1, 20);
  }
  /**
     The getLength method returns a Rectangle
     object's length.
     @param wei The value in the length field.
  */

  public void setDogWeight1(string wei)
  {
      if (wei < MAX_WEIGHT){
        weight = wei;
      }
      else{
        weight = "Too Heavy";
      }
  }

   /**
     The getLength method returns a Rectangle
     object's length.
     @param ownerN The value in the length field.
  */
  public void setDogAge1(string ag)
  {
      if (ag > MAX_AGE){
        age = ag; 
      }
      else {
        age = "Too old";
      }
  }


   public String getDogName1()
   {
      return dogName;
   }

   /**
      The getWidth method returns a Rectangle
      object's width.
      @return The value in the width field.
   */

  public String getOwnerName1()
  {
     return ownerName;
  }

  /**
     The getWidth method returns a Rectangle
     object's width.
     @return The value in the width field.
  */

  public int getDogAge1()
  {
     return age;
  }

  /**
     The getWidth method returns a Rectangle
     object's width.
     @return The value in the width field.
  */

  public double getDogWeight1()
  {
     return weight;
  }

  /**
     The getWidth method returns a Rectangle
     object's width.
     @return The value in the width field.
  */
   
   public double getDoggies()
   {
      return dogName;
      return ownerName;
      return age;
      return weight;

   }
}
