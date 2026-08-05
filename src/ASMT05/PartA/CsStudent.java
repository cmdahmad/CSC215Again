package ASMT05.PartA;

public class CsStudent extends Student {

    private String classes = "From Monday to Friday.";

    CsStudent() {
    }

    CsStudent(String name, double GPA) {
        this.setName(name);
        this.setGPA(GPA);
    }
}
