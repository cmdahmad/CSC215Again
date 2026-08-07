package ASMT05.partB;

public class sharpener {

    String color = "RAW";
    double length = 0;

    sharpener () {}
    sharpener (String color, double length) {
        this.length = length;
        this.color = color;
    }

    public void action() {
        System.out.println("I refine pencils.");
    }
    public String toString() {
        return "A " + this.color + " sharpener";
    }
}
