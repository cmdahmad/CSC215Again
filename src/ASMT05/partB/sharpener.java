package ASMT05.partB;

public class sharpener extends stationaryBox{

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
}
