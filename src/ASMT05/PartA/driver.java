package ASMT05.PartA;

public class driver {
    private static void driver() {

        Student stu2 = new Student("Ahmad Mustafa", 3.730);
        System.out.println(stu2.getName() + " " + stu2.getGPA());

        stu2.setGPA(3.8);
        stu2.setName("Ahmad2 Max");
        System.out.println(stu2.getName() + " " + stu2.getGPA());
        stu2.dance();

    }
    public static void main(String[] args) {
        driver();
    }
}
