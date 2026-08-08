package ASMT05.PartA;

/**********************************************************************************************
 *
 * File: [Java_Design_AhmadMustafa.java]
 * By: [Ahmad Mustafa]
 * Date: [08/08/2026]
 *
 * Description: The purpose of this code is to demonstrate java class encapsulation.
 *
 * ***********************************************************************************************/


public class Java_Design_AhmadMustafa {
    private static void driver() {

        Student stu1 = new Student("Ahmad Mustafa", 3.730); // Create object
        System.out.println(stu1.getName() + " " + stu1.getGPA());

        stu1.setGPA(3.8); // Setter for GPA
        stu1.setName("Ahmad2 Max"); // Setter for Name
        System.out.println(stu1.getName() + " " + stu1.getGPA());

        stu1.dance(); // Method from private encapsulated class.

    }
    public static void main(String[] args) {
        driver();
    }
}
