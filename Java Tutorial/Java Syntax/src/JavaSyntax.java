import java.io.InputStreamReader;
import java.util.Scanner;

//This is my java Tutorial - Java Syntax
public class JavaSyntax {
    public static void main(String[] param) {
        System.out.println("Hello World");

        //Loops in java
        // For loop:
        //for (<initialization>; <continuation/ length of calculation>; <Result/Stop>)
        //Instance looping the squares of number 1 - 10

        for (int j = 1; j <= 10; j++) {
            System.out.println("The square of " + j + " is equals to " + (j * j));

        }
            /*Coding challenge - 1 */
            // Write a java program that allows a user to input their bmi.
            // to enter their weight in kg and height in m2, and display
            // their total body mass index

            // The formula is BMI = kg/m2 where kg is
            // their weight in kilograms and m2 is their height.




            System.out.println("Please Enter your height");

            Scanner sc  = new Scanner(System.in);
            float w = sc.nextFloat();
            System.out.println("Please Enter your weight");
            float h = sc.nextFloat();
            float bmi = w/(h*h);
            System.out.println("Thank you for providing these details. Your current BMI is "  + bmi);

            //2. Tracing Loops - For



        }
    }

