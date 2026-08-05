package ASMT05.PartA;

public class Student {

    private String name = "Student";
    private double GPA = 2.0;
    private String address = "1600 Holloway Ave.";

    Student() {
    }

    Student (String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getGPA() {
        return this.GPA;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    static void dance() {
        DanceStudent.dancer();
    }

    private class DanceStudent {
        static void dancer() {

            System.out.println(" the student dances wohooo");
        }

    }
}
