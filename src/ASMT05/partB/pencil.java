package ASMT05.partB;

public class pencil extends stationaryBox {

    String color = "RAW";
    double length = 0;

    pencil () {}
    pencil (String color, double length) {
        this.length = length;
        this.color = color;
    }

    public void action() {
        System.out.println("I write words.");
    }
}
