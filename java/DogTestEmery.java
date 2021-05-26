/**
   This program demonstrates the Dog class's
   constructor.
   Name: Jase Emery
   Java CS1A Foothilll
*/
import DogEmery.java;

public class DogDemo
{
   public static void main(String[] args)
   { 
      System.out.println("****First display after instantaion****" );
      Dog initial1 = new Dog("(undefined)", "(undefined)", 0.0, 0);

      System.out.println("The dogs name is " +
                       initial1.getDogName1());

      System.out.println("The owners name is " +
                       initial1.getOwnerName1());

    
      System.out.println("The dogs age is " +
                       initial1.getDogAge1());
      System.out.println("The dogs age is " +
                       initial1.getDogWeight1());       
      Dog boxer = new Dog("tim", "jase", 15.0, 12);
      System.out.println("-----------------------------");
      System.out.println("The dogs name is " +
                         boxer.getDogName1());

   
      System.out.println("The owners name is " +
                         boxer.getOwnerName1());

      
      System.out.println("The dogs age is " +
                         boxer.getDogAge1());
      System.out.println("The dogs age is " +
                         boxer.getDogWeight1());
      Dog spike = new Dog("billy", "james", 6.0, 14);
      System.out.println("-----------------------------");
      System.out.println("The dogs name is " +
                         spike.getDogName1());

      System.out.println("The owners name is " +
                         spike.getOwnerName1());
                   
      System.out.println("The dogs age is " +
                         spike.getDogAge1());
      System.out.println("The dogs age is " +
                         spike.getDogWeight1());
      System.out.println("****Second Display After Mutation****" );     
      System.out.println("The dogs name is " +
                         initial1.getDogName1());

      System.out.println("The owners name is " +
                         initial1.getOwnerName1());


      System.out.println("The dogs age is " +
                         initial1.getDogAge1());
      System.out.println("The dogs age is " +
                         initial1.getDogWeight1()); 
      System.out.println("-----------------------------");
      Dog bigBoxer = new Dog("bigtim", "jase", 193.1, 12);
      System.out.println("The dogs name is " +
                         bigBoxer.getDogName1());

   
      System.out.println("The owners name is " +
                         bigBoxer.getOwnerName1());

      
      System.out.println("The dogs age is " +
                         bigBoxer.getDogAge1());
      System.out.println("The dogs age is " +
                         bigBoxer.getDogWeight1());
      Dog bigspike = new Dog("bigbilly", "james", 199.0, 14);
      System.out.println("-----------------------------");
      System.out.println("The dogs name is " +
                         bigspike.getDogName1());
                   
      System.out.println("The owners name is " +
                         bigspike.getOwnerName1());
                                      
      System.out.println("The dogs age is " +
                         bigspike.getDogAge1());
      System.out.println("The dogs weight is " +
                         bigspike.getDogWeight1());

      System.out.println("-----------------------------");
      System.out.println("****Mutator Tests***" ); 
      if (bigspike.getDogAge1() < 20){
        System.out.println("Correctly set dog age" ); 
      }
      else{
        System.out.println("****ERROR***" ); 
      }
      if (bigspike.getDogWeight1() < 200){
        System.out.println("Correctly set dog Weight" ); 
      }
      else{
        System.out.println("****ERROR***" ); 
      }
      System.out.println("-----------------------------");
      System.out.println("****Accessor Tests***" ); 
      System.out.println("Bigspike is owned by " +
      bigspike.getOwnerName1());
   }


}
/*
************************RUN**************************************8
jase@jase-desktop-ml:~$  cd /home/jase ; /usr/bin/env /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /home/jase/.config/Code/User/workspaceStorage/087b67ec678dc8ea7a8766c646bf1aea/redhat.java/jdt_ws/jdt.ls-java-project/bin DogDemo 
****First display after instantaion****
The dogs name is (undefined)
The owners name is (undefined)
The dogs age is 0
The dogs age is 0.0
-----------------------------
The dogs name is tim
The owners name is jase
The dogs age is 12
The dogs age is 15.0
-----------------------------
The dogs name is billy
The owners name is james
The dogs age is 14
The dogs age is 6.0
****Second Display After Mutation****
The dogs name is (undefined)
The owners name is (undefined)
The dogs age is 0
The dogs age is 0.0
-----------------------------
The dogs name is bigtim
The owners name is jase
The dogs age is 12
The dogs age is 193.1
-----------------------------
The dogs name is bigbilly
The owners name is james
The dogs age is 14
The dogs weight is 199.0
-----------------------------
****Mutator Tests***
Correctly set dog age
Correctly set dog Weight
-----------------------------
****Accessor Tests***
Bigspike is owned by james
*/