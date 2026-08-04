package ASMT03.PartA;

/**********************************************************************************************
 *
 * File: [BMI_CSC215_English_AhmadMustafa.java]
 * By: [Ahmad Mustafa]
 * Date: [07/13/2026]
 *
 * Description: The purpose of this code is
 *
 * ***********************************************************************************************/


import java.util.Scanner;
import java.util.Date;
public class v1 {

    // Data problem solved
    static String name, status;
    static int heightF, heightI, height;
    static double weight, BMI, low, high, man;
    static Date date = new Date();

    public static Scanner input = new Scanner(System.in);

    static void welcome () {

        System.out.println("--------------------------------------------------------");
        System.out.println("- Welcome to");
        System.out.println("- BMI English");
        System.out.println("- by Ahmad Mustafa");
        System.out.println("--------------------------------------------------------");


    }
    static void inputs1 () { // all inputs complete
        // Name, height (ft,inches), weight LBS;

        System.out.println("Input Name");
        name = input.nextLine();

        System.out.println("Input height in Feet and Inches");
        heightF = input.nextInt();
        heightI = input.nextInt();

        height = (heightF * 12) + heightI; // Success

        System.out.println("Input weight in LBS");
        weight = input.nextDouble();


        /*
        System.out.println(name);
        System.out.println(height);
        System.out.println(weight);
        System.out.println(BMI);
         */

    }
    static void inputs2 () {
        // lowWeight, highWeight;

        System.out.println("Input LOW weight");
        low = input.nextDouble();
        System.out.println("Input HIGH weight");
        high = input.nextDouble();

    }
    static void formula () {

        BMI = (weight / (height*height)) * 703; // works (BMI Formula)

        if (BMI >= 30) { // Weight Status Check
            status = "Obesity";
        } else if (BMI >= 25) {
            status = "Overweight";
        } else if (BMI >= 18.5) {
            status = "Healthy Weight";
        } else {
            status = "Underweight";
        }
    }

    static double formula2 (double man) {

        double cBMI = (man / (height * height)) * 703; // works (BMI Formula)

        return cBMI;
    }
    static String formula3 (double cBMI) {
        String cStatus;

        if (cBMI >= 30) { // Weight Status Check
            cStatus = "Obesity";
        } else if (cBMI >= 25) {
            cStatus = "Overweight";
        } else if (cBMI >= 18.5) {
            cStatus = "Healthy Weight";
        } else {
            cStatus = "Underweight";
        }
        return cStatus;
    }
    //static void display2 () {
        //System.out.println(man + formula2(man) + formula3(formula2(man)));
    //}

    static void display() {
        System.out.println("Summary Report for " + name);
        System.out.println("Date: " + date);
        System.out.println("BMI: " + BMI);
        System.out.println("Weight: " + status);

    }

    static void report() {
        // Loop 1 - man goes from low to current
        // Insert (this)
        // Loop 2 - man goes from man to high
        // Insert (High)

        // Variables; man, low, high, current(weight)

        System.out.println(low + " "+ formula2(low) + " "+ formula3(formula2(low)) + " (low)");

        for (man = low + 5.5; man < weight; man += 5.5) {
            System.out.println(man + " "+ formula2(man) + " "+ formula3(formula2(man)));
        }

        System.out.println(weight + " "+ formula2(weight) + " "+ formula3(formula2(weight)) + " (this)");

        for (man = man; man < high; man += 5.5) {
            System.out.println(man + " "+ formula2(man) + " "+ formula3(formula2(man)));
        }
        System.out.println(high + " "+ formula2(man) + " "+ formula3(formula2(man)) + " (high)");


        // System.out.println(man + " "+ formula2(man) + " "+ formula3(formula2(man)));
    }
    // Success

    static void goodbye() {
        System.out.println("The SFSU Mashouf Wellness Center is at 755 Font Blvd.");
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println("Thank you for using my program" + name + "!");
        System.out.println("Poopaye!!!");
        System.out.println("--------------------------------------------------------");

    }

    static void driver() {
        welcome();
        inputs1();
        formula();
        display();
        inputs2();
        report();
        goodbye();
    }

    public static void main(String[] args) {
        driver();
    }
}
