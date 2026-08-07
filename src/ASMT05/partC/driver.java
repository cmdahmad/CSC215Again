package ASMT05.partC;

public class driver {

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
