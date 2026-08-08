package ASMT05.partC;

/**********************************************************************************************
 *
 * File: [OOP_ClassRelationship_Inheritance_IS_A_AhmadMustafa.java]
 * By: [Ahmad Mustafa]
 * Date: [08/08/2026]
 *
 * Description: The purpose of this code is to demonstrate OOP Inheritance.
 *
 * ***********************************************************************************************/


public class OOP_ClassRelationship_Inheritance_IS_A_AhmadMustafa {

    public static void driver() {


        CSStudent css1 = new CSStudent(); //Grandchild class
        css1.hello();

        Student stu1 = new Student(); //Child class
        stu1.hello();

        Person per1 = new Person(); //Father class
        per1.hello();

        Person per2; // Object declared as Person
        per2 = new Student(); // Object initialised as a Student
        per2.hello(); //Object defined as Student


    }
    public static void main(String[] args) {
        driver();
    }
}
