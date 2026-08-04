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
public class v4 {

    // Data problem solved
    static String name;
    static int height;
    static double weight, low, high;

    public static Scanner input = new Scanner(System.in);

    // ANSI background colors (Highlighting)
    public static final String BG_YELLOW = "\u001B[43m";

    // Reset code to clear formatting
    public static final String RESET = "\u001B[0m";

    static void dash(int j) {
        for (int i = 0; i < j; i ++) {
            System.out.print("-");
        }
        System.out.println();
    }

    static void welcome () { //Final Version
        dash(89);
        System.out.println("-- Welcome to:");
        System.out.println("--            BODY MASS INDEX (BMI) COMPUTATION, CSC 215, English Version"); //1.
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
    static double formula2 (double man) { //calculate and return BMI
        //input weight output BMI
        double cBMI = (man / (height * height)) * 703; // works (BMI Formula)
        if (cBMI >= 30) { // Weight Status Check
            cBMI = Math.round(cBMI * 100000.0) / 100000.0;
        } else if (cBMI >= 25) {
            cBMI = Math.round(cBMI * 10000.0) / 10000.0;
        } else if (cBMI >= 18.5) {
            cBMI = Math.round(cBMI * 1000.0) / 1000.0;
        } else {
            cBMI = Math.round(cBMI * 100.0) / 100.0;
        }
        //cBMI = Math.round(cBMI * 100.0) / 100.0;

        return cBMI;
    }
    static String formula3 (double cBMI) { //Calculate and return Status
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

    static String getDate() { //Date format
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
        man = Math.round(man * 100.0) / 100.0;
        System.out.print("| "+ man + "      | "+ formula2(man) + "       | "+ formula3(formula2(man)) + "      |");
    }
    static void display3 (double man) {
        man = Math.round(man * 100.0) / 100.0;
        System.out.print(man + " ");
        System.out.print(formula2(man) + " ");
        System.out.println();
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
        double man = low + 5.5;
        display2(low);
        System.out.println(" (low)");

        for (double i = man; i < weight; i += 5.5) {
            display2(i);
            System.out.println();
            man = i;
        }
        // display current
        display2(weight);
        System.out.println(" (this)");

        // display current --> high
        for (double i = man; i < high; i += 5.5) {
            display2(i);
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
        System.out.println("The SFSU Mashouf Wellness Center is at 755 Font Blvd."); //2.
        System.out.println();
        dash(89);
        System.out.println("-- Thank you for using my program, " + name + "!");
        System.out.println("-- Poopaye!!!");
        dash(89);
    }
    static void sample () {
        int row = 3, col = 6;
        for (int i = 0 ; i < row; i++) {
            for (int j = 0 ; j < col; j++) {
                if (j == 0) {
                    System.out.printf("|  %d|", j);
                } else {
                    System.out.print(j + "  |");
                }
            }
            System.out.println();
        }
    }
    static void sample2 () {
        int col = 3;
        int row = 0; // count number of rows: low + low->current + current + current->high + high. OR, go low to high + 3
        int count = 0;

        double man = low + 5.5;

        for (man = man; man < high; man += 5.5) { //make readable later
            row++;
        }
        //row += 4;

        //intro
        dash(55);
        System.out.println("| WEIGHT     " + "| BMI         " + "| WEIGHT STATUS            |");
        dash(55);

        //print low
        man = low;
        System.out.printf("| %.2f     |", man);
        System.out.printf(" %.2f       | ", formula2(man));
        System.out.print(formula3(formula2(man)) + "        " + BG_YELLOW + "(LOW)" + RESET + " |");
        System.out.println();
        man += 5.5;


        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if (j == 0) {
                    System.out.printf("| %.2f     |", man);
                } else if (j == 1) {
                    if (formula2(man) >= 30) { // Weight Status Check
                        System.out.printf(" %.5f    | %s                  |", formula2(man), formula3(formula2(man)));
                    } else if (formula2(man) >= 25) {
                        System.out.printf(" %.4f     | %s               |", formula2(man), formula3(formula2(man)));
                    } else if (formula2(man) >= 18.5) {
                        System.out.printf(" %.3f      | %s           |", formula2(man), formula3(formula2(man)));
                    } else {
                        System.out.printf(" %.2f       | %s              |", formula2(man), formula3(formula2(man)));
                    }

                } else {
                    //System.out.print(formula3(formula2(man)) + " |");
                    man += 5.5;
                }
            }
            System.out.println();
            if (man > weight && count < 1) {
                System.out.printf("| %.2f     |", weight);
                System.out.printf(" %.5f    | ", formula2(weight));
                System.out.print(formula3(formula2(weight)) + " (this)           |");
                System.out.println();
                count++;
            }
        }

        man = high;
        System.out.printf("| %.2f     |", man);
        System.out.printf(" %.5f    | ", formula2(man));
        System.out.print(formula3(formula2(man)) +"           " + BG_YELLOW + "(HIGH)" + RESET + " |");
        System.out.println();

        dash(55);


        //System.out.printf("%d", row);

    }

    static void driver() {
        welcome();
        inputs1();
        display();
        inputs2();
        sample2();
        //report();
        goodbye();
    }

    public static void main(String[] args) {
        driver();
    }
}
// 3 updates: Format for the table.
// Summary1 BMI rounded 100.00 //done
// Date and Time

// Otto Minion
// 6 5
// 253.1
// 149.2
// 256.41

//System.out.printf("%.2f  %.4f", 143.4, 143.4);
//System.out.println(BG_YELLOW + "Highlighted Text" + RESET);