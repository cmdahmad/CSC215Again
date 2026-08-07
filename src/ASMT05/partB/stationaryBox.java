package ASMT05.partB;

public class stationaryBox {

    String color;
    Object [] items;

    stationaryBox(){}
    stationaryBox(String color, Object[] items) {
        this.color = color;
        this.items = items;
    }
    public void displayInfo() {
        System.out.println("This " + this.color + " stationary box contains: ");

        for (Object item : this.items) {
            System.out.println(item);
        }
    }

    public void box() {
        System.out.println("I am essential to the Stationary Box.");
    }

}
