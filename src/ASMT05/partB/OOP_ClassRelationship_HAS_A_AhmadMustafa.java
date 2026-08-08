package ASMT05.partB;

/**********************************************************************************************
 *
 * File: [OOP_ClassRelationship_HAS_A_AhmadMustafa.java]
 * By: [Ahmad Mustafa]
 * Date: [08/08/2026]
 *
 * Description: The purpose of this code is to demonstrate OOP Aggregation.
 *
 * ***********************************************************************************************/


public class OOP_ClassRelationship_HAS_A_AhmadMustafa {

    public static void driver() {

        pencil pen1 = new pencil(); // pencil object
        eraser era1 = new eraser(); // eraser object
        sharpener sha1 = new sharpener(); // sharpener object

        Object[] obj = {pen1, era1, sha1}; //Object array for aggregation.

        stationaryBox sta1 = new stationaryBox("Black", obj); //Stationary object with aggregated object array.
        sta1.displayInfo();

    }
    public static void main(String[] args) {
        driver();
    }
}