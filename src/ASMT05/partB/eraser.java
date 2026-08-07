package ASMT05.partB;

public class eraser {

    String color = "White";
    double length = 0.0;


    eraser () {}
    eraser (String color, double length) {
        this.length = length;
        this.color = color;
    }

    public void action() {
        System.out.println("I erase words.");
    }
    public String toString() {
        return "A " + this.color + " eraser";
    }

}
