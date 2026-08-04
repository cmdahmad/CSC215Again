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
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class v3 {

    // Data problem solved
    static String name;
    static int height;
    static double weight, low, high;
    //static DateFormat date = new DateFormat();

    public static Scanner input = new Scanner(System.in);

    static void dash(int j) {
        for (int i = 0; i < j; i ++) {
            System.out.print("-");
        }
        System.out.println();
    }

    static void welcome () { //Final Version
        dash(89);
        System.out.println("-- Welcome to:");
        System.out.println("--            BODY MASS INDEX (BMI) COMPUTATION, CSC 215, English Version");
        System.out.println("--                                                                   by Ahmad Mustafa");
        dash(89);
    }

    static void inputs1 () {
        // all inputs complete
        // Name, height (ft,inches), weight LBS;
        int heightF, heightI;

        System.out.print("\nPlease enter your full name: ");
        name = input.nextLine();

        System.out.print("Please enter height in feet and inches for " + name + ": ");
        heightF = input.nextInt();
        heightI = input.nextInt();

        height = (heightF * 12) + heightI; // Success

        System.out.print("Please enter weight in pounds for " + name + ": ");
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

        System.out.print("\nPlease enter a LOW weight in pounds for " + name + ": ");
        low = input.nextDouble();
        System.out.print("Please enter a HIGH weight in pounds for " + name + ": ");
        high = input.nextDouble();
        System.out.println();

    }
    static double formula2 (double man) {
        //input weight output BMI
        double cBMI = (man / (height * height)) * 703; // works (BMI Formula)
        cBMI = Math.round(cBMI * 100.0) / 100.0;

        return cBMI;
    }
    static String formula3 (double cBMI) {
        //input BMI output Weight Status
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

    static String getDate() {
        LocalDate month = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formattedTime = currentTime.format(formatter);

        return  month.getMonth() + " " + month.getDayOfMonth()  + ", " + month.getYear() + " at " + formattedTime.toUpperCase();
    }

    static void display() { // Final Version
        System.out.println("\n-- SUMMARY REPORT for " + name.toUpperCase());
        System.out.println("-- Date and Time:      " + getDate());
        System.out.println("-- BMI:                " + formula2(weight) + " (or " + Math.round(formula2(weight) * 10.0) / 10.0 + " if rounded)");
        System.out.println("-- Weight Status:      " + formula3(formula2(weight)));
    }
    static void display2 (double man) {
        System.out.print(man + " "+ formula2(man) + " "+ formula3(formula2(man)));
    }

    static void report() {
        // Loop 1 - man goes from low to current
        // Insert (this)
        // Loop 2 - man goes from man to high
        // Insert (High)

        // Variables; man, low, high, current(weight)

        dash(55);
        System.out.println("| WEIGHT     " + "| BMI         " + "| WEIGHT STATUS            |");
        dash(55);
        // display low -> current
        double man;
        display2(low);
        System.out.println(" (low)");

        for (man = low + 5.5; man < weight; man += 5.5) {
            display2(man);
            System.out.println();
        }
        // display current
        display2(weight);
        System.out.println(" (this)");

        // display current --> high
        for (man = man; man < high; man += 5.5) {
            display2(man);
            System.out.println();
        }

        // display high
        display2(high);
        System.out.println(" (high)");
        dash(55);
    }
    // Success

    static void goodbye() {
        System.out.println();
        System.out.println("The SFSU Mashouf Wellness Center is at 755 Font Blvd.");
        System.out.println();
        dash(89);
        System.out.println("-- Thank you for using my program, " + name + "!");
        System.out.println("-- Poopaye!!!");
        dash(89);
    }

    static void driver() {
        welcome();
        inputs1();
        display();
        inputs2();
        report();
        goodbye();
    }

    public static void main(String[] args) {
        driver();
    }
}
// 3 updates: Format for the table.
// Summary1 BMI rounded 100.00 //done
// Date and Time