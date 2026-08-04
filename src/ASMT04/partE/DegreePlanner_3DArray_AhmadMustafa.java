package ASMT04.partE;
/**********************************************************************************************
 *
 * File: [DegreePlanner_3DArray_AhmadMustafa.java]
 * By: [Ahmad Mustafa]
 * Date: [08/01/2026]
 *
 * Description: The purpose of this code is to load and print a 3D Array
 *
 * ***********************************************************************************************/

public class DegreePlanner_3DArray_AhmadMustafa {
    public static void main(String[] args) {

        String[] semester01 = {"csc101", "csc102", "csc103", "csc104", "csc105", "csc106"};
        String[] semester02 = {"csc201", "csc202", "csc203", "csc204", "csc205", "csc206"};
        String[] semester03 = {"csc301", "csc302", "csc303", "csc304", "csc305", "csc306"};
        String[] semester04 = {"csc401", "csc402", "csc403", "csc404", "csc405", "csc406"};

        String[][][] arr1 = new String[4][3][2];

        arr1 = new String[][][]{
                {
                    {"csc101","csc102"},
                {"csc103","csc104"},
                {"csc105","csc106"}
                },
                {
                    {"csc201","csc202"},
                    {"csc203","csc204"},
                    {"csc205","csc206"}
                },
                {
                    {"csc301","csc302"},
                    {"csc303","csc304"},
                    {"csc305","csc306"}
                },
                {
                    {"csc401","csc402"},
                    {"csc403","csc404"},
                    {"csc405","csc406"}
                }
        };

        System.out.println("Printing data... from one 3D String[4][3][2] array containing 24 items: ");
        int l = 1;
        int count = 1;

        for(int i = 0; i < arr1.length; i++) { // print 3d array
            System.out.print("- Semester #" + l + ": ");
            for(int j = 0; j < arr1[i].length; j++) {
                for(int k = 0; k < arr1[i][j].length; k++) {
                    System.out.print(arr1[i][j][k]);
                    if (count % 6 == 0) { //No comma after every 6th class

                    } else {
                        System.out.print(", ");
                    }
                    count++;
                }
            }
            System.out.println(); // add line after end of semester
            l++;
        }

    }
}
// 4 1d arrays are provided
// Program wants me to use these 1d arrays to create a 3d array
// Then the program asks me to display that 3d array
//
//
//
//
//
//
//
//
//
//
// .
