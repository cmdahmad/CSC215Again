package ASMT06.partC;

public class main {
    public static void driver() {

        char a = 'a';
        char b = 'a';
        String c = "true";
        String d = "false";
        int i = 1;
        int j = 1;

        if (true) {
            System.out.println("equal");
        }
        else System.out.println("unequal");


    }
    public static void main(String[] args) {
        driver();
    }
}

// .equals does not work for primitive types
// .compareTo requires an int and int only
