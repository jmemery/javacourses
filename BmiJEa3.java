/*
John 'Jase' Emery
This program demonstrates accepting user inputs and preforming
functions based on the conditions of those imputs
CS1A Foothill 
*/

import java.util.Scanner;
// I dont know why the public class didnt run on my system here
// but i changed it to class and it ran...
class jase {
  public static void main(String[] args) {
{
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter your weight in kgs:");
        double weight = input.nextDouble();
        if (weight <= 0)
        {
            System.out.println("Please input a valid weight!!");
            System.exit(0);
        }
        else 
        System.out.println("Please input your height in cm:");
        double height = input.nextDouble();
            if(height < 0)
            {
                System.out.println("The height that you entered is invalid!!");
                System.exit(0);
            }
            else
            {
                double bmi = (weight / height / height) * 10000;
                System.out.println("Your BMI is " + String.format("%.2f", bmi));
                if(bmi < 18.5)
                {
                    System.out.println("You are underweight!!");
                }
                else if (bmi >= 18.5 && bmi <= 25)
                {
                    System.out.println("You are at a normal weight!!");
                }
                else if (bmi >= 25 && bmi <= 29.9)
                {
                    System.out.println("You are overweight!!");
                }
                else if (bmi > 30)
                {
                    System.out.println("You are obease!!");
                }
            }
    }
}
}

/*
*************************************************************RUN************************************************************************
jase@jase-desktop-ml:~$  /usr/bin/env /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_b4928/jdt_ws/jdt.ls-java-project/bin jase 
Please enter your weight in kgs:
90.1
Please input your height in cm:
190.3 
Your BMI is 24.88
You are at a normal weight!!
jase@jase-desktop-ml:~$  /usr/bin/env /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_b4928/jdt_ws/jdt.ls-java-project/bin jase 
Please enter your weight in kgs:
110.1
Please input your height in cm:
180.4
Your BMI is 33.83
You are obease!!
jase@jase-desktop-ml:~$  /usr/bin/env /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_b4928/jdt_ws/jdt.ls-java-project/bin jase 
Please enter your weight in kgs:
100.1
Please input your height in cm:
190.2
Your BMI is 27.67
You are overweight!!
jase@jase-desktop-ml:~$  /usr/bin/env /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_b4928/jdt_ws/jdt.ls-java-project/bin jase 
Please enter your weight in kgs:
60.2
Please input your height in cm:
191.2
Your BMI is 16.47
You are underweight!!
jase@jase-desktop-ml:~$ 
*/