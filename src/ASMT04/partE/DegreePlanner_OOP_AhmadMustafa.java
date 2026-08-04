package ASMT04.partE;
/**********************************************************************************************
 *
 * File: [DegreePlanner_OOP_AhmadMustafa.java]
 * By: [Ahmad Mustafa]
 * Date: [08/01/2026]
 *
 * Description: The purpose of this code is to load and print an Custom object array.
 *
 * ***********************************************************************************************/

public class DegreePlanner_OOP_AhmadMustafa {

    public static Semester[] sem = new Semester[4];
    public static void data1() {
        Semester sem1 = new Semester("csc101", "csc102", "csc103", "csc104", "csc105", "csc106");
        Semester sem2 = new Semester("csc201", "csc202", "csc203", "csc204", "csc205", "csc206");
        Semester sem3 = new Semester("csc301", "csc302", "csc303", "csc304", "csc305", "csc306");
        Semester sem4 = new Semester("csc401", "csc402", "csc403", "csc404", "csc405", "csc406");

        sem = new Semester[]{sem1, sem2, sem3, sem4};
    }

    public static void print() {
        data1();
        System.out.println("Printing data... from one 1D Semester[] Array containing 4 items: ");
        for(int i = 0; i < sem.length; i++) {
            System.out.print(" - Semester #" + (i+1) + ": ");
            sem[i].print();
            System.out.println();
        }

    }
    public static void main (String[] args) {
        print();
    }
}
