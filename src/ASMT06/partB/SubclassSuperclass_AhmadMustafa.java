package ASMT06.partB;

/**********************************************************************************************
 *
 * File: [SubclassSuperclass_AhmadMustafa.java]
 * By: [Ahmad Mustafa]
 * Date: [08/11/2026]
 *
 * Description: The purpose of this code is to demonstrate Polymorphism Upcasting/Downcasting.
 *
 * ***********************************************************************************************/

public class SubclassSuperclass_AhmadMustafa {
    public static void driver() {

        //partB
        Dog dog1 = new Dog(); // Pure dog, subclass
        Animal ani1 = dog1; // Implicit Upcasting

        //partB 3)
        dog1 = (Dog) ani1; // Explicit Downcasting
        dog1.sayHelloDog(); //Dog method after Upcasting to Supertype, and then Downcasting to Subtype


    }
    public static void main (String[] args) {
        driver();
    }
}
// Testing Guide:
//make 2 variables
//pure Dog dog1
//Animal ani1 which is equal to dog1
//
//110 to 112
//dog1.sayHelloAnimal()
//dog1.sayHelloDog()
//ani1.sayHelloAnimal()
// done
//113
//ani1.sayHelloDog // Animal object cant access Dog (subtype) method
// done
//117
//Animal ani2 = new Animal();
//Dog dog2 = (Dog) ani2; // Error
//
//122
//dog1 = (Dog) ani1;
