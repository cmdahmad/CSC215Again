package ASMT05.partB;

public class driver {

    public static void driver() {

        pencil pen1 = new pencil(); // pencil object
        eraser era1 = new eraser(); // eraser object
        sharpener sha1 = new sharpener(); // sharpener object

        Object[] obj = {pen1, era1, sha1};

        stationaryBox sta1 = new stationaryBox("Black", obj);
        sta1.displayInfo();

    }
    public static void main(String[] args) {
        driver();
    }
}