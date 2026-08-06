package ASMT05.partB;

public class driver {

    public static void driver() {

        pencil pen1 = new pencil(); // pencil object
        eraser era1 = new eraser(); // eraser object
        sharpener sha1 = new sharpener(); // sharpener object

        pen1.action(); // pencil method
        era1.action(); // eraser method
        sha1.action(); // sharpener method

        pen1.box(); //stationaryBox method
        era1.box(); //stationaryBox method
        sha1.box(); //stationaryBox method

    }
    public static void main(String[] args) {
        driver();
    }
}
