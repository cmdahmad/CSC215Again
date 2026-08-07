package ASMT05.partC;

public class Student extends Person {

    String name;

    Student () {}
    Student (String name) {
        this.name = name;
    }

    @Override
    void hello() {
        System.out.println("Hello I am a Student");
    }
}