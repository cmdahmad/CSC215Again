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
// Attributes: Name, heightft, height inches, currentWeight, lowWeight, highWeight
// Calculations: totalHeight (heightft, heightI), BMI(totalHeight, weight), weightStatus (BMI), Date()
// Print: welcome, summaryReport, indexReport, goodbye
// Other Variables: tempWeight, tempBMI, tempStatus


import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class v5 {

    // Data problem solved
    static String name;
    static int height;
    static double weight, low, high;
    public static Scanner input = new Scanner(System.in);

    // ANSI background colors (Highlighting)
    public static final String BG_YELLOW = "\u001B[43m";
    // Reset code to clear formatting
    public static final String RESET = "\u001B[0m";

    static void dash(int j) { // Helper method -- create dashes
        for (int i = 0; i < j; i ++) {
            System.out.print("-");
        }
        System.out.println();
    }

    static void welcome () { // Print Method
        dash(89);
        System.out.println("-- Welcome to:");
        System.out.println("--            BODY MASS INDEX (BMI) Computation, CSC 215, English Version");
        System.out.println("--                                                                   by Ahmad Mustafa");
        dash(89);
    }


    static void inputs1 () { //Collect attributes 1 -- Name, HeightF, heightI, weightLbs
        int heightF, heightI;

        System.out.print("\nPlease enter your full name: ");
        name = input.nextLine();

        System.out.print("Please enter height in feet and inches for " + name + ": ");
        heightF = input.nextInt();
        heightI = input.nextInt();

        height = (heightF * 12) + heightI; // Success

        System.out.print("Please enter weight in pounds for " + name + ": ");
        weight = input.nextDouble();
    }

    static void display() { // Print Method -- summaryReport
        System.out.println("\n-- SUMMARY REPORT for " + name.toUpperCase());
        System.out.println("-- Date and Time:      " + getDate());
        System.out.println("-- BMI:                " + formula2(weight) + " (or " + Math.round(formula2(weight) * 10.0) / 10.0 + " if rounded)"); //1.
        System.out.println("-- Weight Status:      " + formula3(formula2(weight)));
    }

    static void inputs2 () { //getAttributes -- lowWeight, highWeight

        System.out.print("\nPlease enter a LOW weight in pounds for " + name + ": ");
        low = input.nextDouble();
        System.out.print("Please enter a HIGH weight in pounds for " + name + ": ");
        high = input.nextDouble();
        System.out.println();

    }
    static double formula2 (double man) { //Calculation method -- BMI(totalHeight, weight)
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
    static String formula3 (double cBMI) { //Calculation method -- weightStatus(BMI)
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

    static String getDate() { //Calculation method -- Date()
        LocalDate month = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formattedTime = currentTime.format(formatter);

        return  month.getMonth() + " " + month.getDayOfMonth()  + ", " + month.getYear() + " at " + formattedTime.toUpperCase();
    }
    static void sample () { //Sample reference on how to use 2d nested loops.
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

    static void sample2 () { //Print method3 -- indexReport
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
            if (man > weight && count < 1) {
                System.out.printf("| %.2f     |", weight);
                System.out.printf(" %.5f    | ", formula2(weight));
                System.out.print(formula3(formula2(weight)) + " (this)           |");
                System.out.println();
                count++;
            }
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
            System.out.println(); //3.
        }

        man = high;
        System.out.printf("| %.2f     |", man);
        System.out.printf(" %.5f    | ", formula2(man));
        System.out.print(formula3(formula2(man)) +"           " + BG_YELLOW + "(HIGH)" + RESET + " |");
        System.out.println();

        dash(55);
        //System.out.printf("%d", row);
    }
    static void goodbye() { //Print method -- goodbye
        System.out.println();
        System.out.println("\nThe SFSU Mashouf Wellness Center is at 755 Font Blvd.");
        System.out.println();
        dash(89);
        System.out.println("-- Thank you for using my program, " + name + "!");
        if (name.contains("innie")) {
            System.out.println("-- Ear-esistible!!!");
        } else {
            System.out.println("-- Poopaye!!!");
        }
        dash(89);
    }

    static void driver() { //Driver method
        welcome(); //Print1
        inputs1(); //getData1 (from user)
        display(); //Print2
        inputs2(); //getData2 (from user)
        sample2(); //Print3
        goodbye(); //Print4
    }

    public static void main(String[] args) { //Main method
        driver();
    }
}

// Success
// Otto Minion
// 6 5
// 253.1
// 149.2
// 256.41

//

//System.out.printf("%.2f  %.4f", 143.4, 143.4);
//System.out.println(BG_YELLOW + "Highlighted Text" + RESET);