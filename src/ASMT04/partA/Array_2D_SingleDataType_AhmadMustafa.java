package ASMT04.partA;
/**********************************************************************************************
 *
 * File: [Array_2D_SingleDataType_AhmadMustafa.java]
 * By: [Ahmad Mustafa]
 * Date: [07/28/2026]
 *
 * Description: The purpose of this code is to print 2 irregular arrays.
 *
 * ***********************************************************************************************/


public class Array_2D_SingleDataType_AhmadMustafa {
    public static void print(char[][] arr) {
        System.out.println("Displaying contents in any 2D arrays:");
        int count = 0;
        for(int i = 0; i < arr.length; i++) { //Count Max length
            if (count <= arr[i].length) {
                count = arr[i].length;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            int count2 = 0;
            if (count > arr[i].length) {
                count2 = count-arr[i].length;
            }
            for (int k = 0; k < count2; k++) {
                System.out.printf("    ");
            }
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%-4S", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row = 7;
        int col = 7;

        char [][] alpha = {
                {'A', 'B', 'C', 'D', 'E', 'F', 'G' }, //check length for this guy 7
                {'H', 'I', 'J', 'K' }, // 7 minus this guy: 3 -- add 3 blank spaces
                {'L', 'M', 'N', 'O', 'P' }, // 7 minus this guy: 2 -- add 2 blank spaces
                {'Q', 'R', 'S' }, // 7 minus this guy: 4 -- add 4 blank spaces
                {'T', 'U', 'V' },
                {'W', 'X' },
                {'Y', 'Z' }
        };

        print(alpha);


        char[][] shot = new char[7][7];
        shot[0] = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        shot[1] = new char[]{'H', 'I', 'J', 'K'};
        shot[2] = new char[]{'L', 'M', 'N', 'O', 'P'};
        shot[3] = new char[]{'Q', 'R', 'S'};
        shot[4] = new char[]{'T', 'U', 'V'};
        shot[5] = new char[]{'W', 'X'};
        shot[6] = new char[]{'Y', 'Z'};

        print(shot);

    }

}
