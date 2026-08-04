package ASMT04.partE;

public class Semester {

    String [] classes = new String[6];

    Semester(String a, String b, String c, String d, String e, String f) {
        this.classes[0] = a;
        this.classes[1] = b;
        this.classes[2] = c;
        this.classes[3] = d;
        this.classes[4] = e;
        this.classes[5] = f;
    }
    public void print() {
        int count = 1;
        for (int i = 0; i < 6; i++) {
            System.out.printf(this.classes[i]);
            if (count % 6 == 0) {
            } else {
                System.out.print(", ");
            }
            count++;
        }
    }
}
