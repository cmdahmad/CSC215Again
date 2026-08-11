package ASMT06.partA;

/**********************************************************************************************
 *
 * File: [SubclassSuperclass_AhmadMustafa.java]
 * By: [Ahmad Mustafa]
 * Date: [08/10/2026]
 *
 * Description: The purpose of this code is to demonstrate Superclass Subclass variables.2
 *
 * ***********************************************************************************************/

public class SubclassSuperclass_AhmadMustafa {
    public static void driver() {

        // Part A
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        Animal animalCat = new Cat(); // Cat Object stored in an Animal Storage Variable
        Animal animalDog = new Dog(); // Dog Object stored in an Animal Storage Variable


        int i = 10; // Int is supertype. Double is subtype. Int stores less info. Double stores more info.
        double j = i;
        int k = (int) j;
        System.out.println(j+0.5);
        System.out.println(k);

    }
    public static void main (String[] args) {
        driver();
    }
}
// Testing Guide:
//1 pure animal object.
//1 pure dog object.
//1 pure cat object.
//
//1 line calling sayHelloAnimal.
//1 line calling sayHelloDog.
//
//2 lines of failed downcasting.
//2 lines of failed cross casting.
//
//2 lines of successful upcasting objects for Cat and Dog stored in an Animal variable.
//
//2 lines of successful animal methods.
//
//2 lines of failed cat methods..
