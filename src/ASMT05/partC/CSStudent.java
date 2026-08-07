package ASMT05.partC;

public class CSStudent extends Student {

    String name;

    CSStudent () {}
    CSStudent (String name) {
        this.name = name;
    }

    @Override
    void hello () {
        System.out.println("Hello I am a CS Student");
    }
}
