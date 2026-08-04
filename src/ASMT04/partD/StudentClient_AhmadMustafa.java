package ASMT04.partD;
/**********************************************************************************************
 *
 * File: [StudentClient_AhmadMustafa.java]
 * By: [Ahmad Mustafa]
 * Date: [07/31/2026]
 *
 * Description: The purpose of this code is to create 3 student objects and have the option to
 *              update them.
 *
 * ***********************************************************************************************/

import java.util.Scanner;
public class StudentClient_AhmadMustafa {

    public static Scanner input = new Scanner(System.in);
    public static Student[] students;

    public static void driver() { //Sequence creation
        //welcome message and receive inputs
        System.out.println("[+] Creating 3 students...");
        inputs(3);

        //first display
        System.out.println("[+] The 3 students created: ");
        display1(students);
        System.out.println();

        //Update Name
        System.out.print("[-] Enter a student's full name to update the student: ");
        String name = input.nextLine().toLowerCase();

        for (int i = 0; i < students.length; i++) {
            if (name.contains(students[i].getName().toLowerCase())) { //if name matches
                System.out.print("[-] Enter new student name: ");
                students[i].setName(input.nextLine());
                System.out.print("[-] Enter new student gpa: ");
                students[i].setGpa(input.nextDouble());
                input.nextLine();
            }
        }
        System.out.println();

        //Updated display
        System.out.println("[+] The 3 students updated: ");
        display1(students);
    }
    public static void inputs(int count) {
        students = new Student[count];

        for (int i = 0; i < count; i++) {//missing create object lolllszz
            int j = i+1;
            students[i] = new Student("GoodBoy", 3.0);
            System.out.print(" - Enter a name for student #" + j + ": ");
            students[i].setName(input.nextLine());
            System.out.print(" - Enter a GPA for student #" + j + ": ");
            students[i].setGpa(input.nextDouble());
            input.nextLine();
            System.out.println();
        }
    }
    public static void display1(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
    public static void main(String[] args) {
        driver();
    }
}
// All comments:
// Mickey Mouse 3.3 Minnie Mouse 3.9 Goofy Dog 2.1
// v1 successful
// next up instead of updating tempStu, we want to update student[i].
// What we can do is store the i value as an int, and then take that int to update students[int].setName (line 54 and 56)
//    // One alternative is to create all students in the beginning
//    // Then store them in the array
//    // Then setMethod for each student in the array
//    // Method inputs(int count)
//    //Student stu1 = new Student("Gola", 3.730);
//    //students[0] = stu1;
//    //similarly
//    //students[0] = new Student("GoodBoy", 3.0);
//    //input.nextLine();