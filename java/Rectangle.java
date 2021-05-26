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

   public Rectangle(double len, double w)
   {
      length = len;
      width = w;
   }

   /**
      The setLength method stores a value in the
      length field.
      @param len The value to store in length.
   */

   public void setDogName1(string dogN)
   {
      dogName = dogN;
   }

   /**
      The getLength method returns a Rectangle
      object's length.
      @param dogN The value in the length field.
   */

  public void setOwnerName1(string ownerN)
  {
     ownerName = ownerN;
  }

  /**
     The getLength method returns a Rectangle
     object's length.
     @param ownerN The value in the length field.
  */
  public void setDogWeight1(string wei)
  {
     weight = wei;
  }

  /**
     The getLength method returns a Rectangle
     object's length.
     @param wei The value in the length field.
  */
  public void setDogAge1(string ag)
  {
     age = ag;
  }

  /**
     The getLength method returns a Rectangle
     object's length.
     @param ownerN The value in the length field.
  */
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
      return dogOwner;
      return age;
      return weight;

   }
}
