package ASMT04.partB;

/**********************************************************************************************
 *
 * File: [Array_2D_MultipleDataTypes_AhmadMustafa.java]
 * By: [Ahmad Mustafa]
 * Date: [07/29/2026]
 *
 * Description: The purpose of this code is to demonstrate my knowledge of 2D arrays.
 *
 * ***********************************************************************************************/
import java.util.Scanner;

public class Array_2D_MultipleDataTypes_AhmadMustafa {
    public static Scanner input = new Scanner(System.in);
    public static Object[][] arr = new Object[4][3];

    //Print method
    public static void print1(Object[][] str) {
        for(int i = 0; i < str.length; i++) {
            for(int j = 0; j < str[i].length; j++) {
                System.out.printf("           %-10s", str[i][j]);
            }
            System.out.println();
        }
    }

    public static void inputs() {
        System.out.print("Row 1 | Please enter 3 Integers: ");
        arr[0][0] = input.nextInt();
        arr[0][1] = input.nextInt();
        arr[0][2] = input.nextInt();

        System.out.print("Row 2 | Please enter 3 Characters: ");
        arr[1][0] = input.next().charAt(0);
        arr[1][1] = input.next().charAt(0);
        arr[1][2] = input.next().charAt(0);

        System.out.print("Row 1 | Please enter 3 Strings: ");
        arr[2][0] = input.next();
        arr[2][1] = input.next();
        arr[2][2] = input.next();

        System.out.print("Row 1 | 1 Int, 1 Char, 1 String: ");
        arr[3][0] = input.nextInt();
        arr[3][1] = input.next().charAt(0);
        arr[3][2] = input.next();
    }

    public static void print(){

        //create data type view array
        String [][] dataType = new String[4][3];
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                dataType[i][j] = arr[i][j].getClass().getSimpleName();
            }
        }
        System.out.println();

        System.out.println("\nYour 2D array of multiple data types: ");

        System.out.println("\n- Data Type View: ");
        print1(dataType);

        System.out.println("\n- Data Value View: ");
        print1(arr);

    }
    public static void driver() {
        inputs();
        print();
    }
    public static void main(String[] args) {
        driver();
    }
}
