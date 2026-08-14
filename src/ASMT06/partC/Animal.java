package ASMT06.partC;

public class Animal {

    boolean isAlive;

    Animal() {
        isAlive = true;
    }

    void sayHelloAnimal () {
        System.out.println("Hello I am an animal!");
    }

    void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    boolean getIsAlive() {
        return this.isAlive;
    }
}