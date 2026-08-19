package ASMT06.partC;

/**********************************************************************************************
 *
 * File: [Equals_CompareTo_AhmadMustafa.java]
 * By:   [Ahmad Mustafa]
 * Date: [08/13/2026]
 *
 * Description: The purpose of this code is to demonstrate native and overridden .equals/.compareTo
 *              methods.
 *
 * ***********************************************************************************************/

public class Equals_CompareTo_AhmadMustafa {
    public static void driver() {

        //System.out.println("Part 1) Equality operator '==' ");
        Animal s1 = new Animal();
        Animal s2 = new Animal();

        //System.out.println( (s1 == s2) ? "True" : "False" ); //Line 141, False

        Animal s3 = s1;
        //System.out.println( (s1 == s3) ? "True" : "False" ); //Line 145, True

        //System.out.println( (s2 == s3) ? "True" : "False" ); //Line 147, False

        //System.out.println("Part 2) Native .equals");

        String string1 = "Hello";
        String string2 = "Hello";
        String string3 = "Hola";
        String string4 = "C";
        char c = 'C';

        //System.out.println( (string1.equals(string2)) ? "True" : "False" ); // Line 161, True
        //System.out.println( (string1.equals(string3)) ? "True" : "False" ); // Line 163, False
        //System.out.println((string1.equals(c)) ? "True" : "False" ); // Line 165, False
        //System.out.println((string4.equals(c)) ? "True" : "False" ); // Line 167, False

        //System.out.println("Part 3) Native compareTo method");

        //System.out.println((string1.compareTo(string1))); // Line 171, 0
        //System.out.println((string1.compareTo(string2))); // Line 172, 0
        //System.out.println((string1.compareTo(string3))); // Line 174, -10
        //System.out.println((string3.compareTo(string1))); // Line 177, 10
        //System.out.println((string3.compareTo(c))); // Line 180, ERROR


        //System.out.println("Part 4) Lines 306 to 308; Overridden .equals method");

        Phone phone1 = new Phone(500);
        Phone phone2 = new Phone(500);
        Phone phone3 = new Phone(800);

        //System.out.println(phone1.equals(phone2)); // Line 306, true
        //System.out.println(phone1.equals(phone3)); // Line 307, false
        //System.out.println(phone1.equals("Hii!")); // Line 308, false

        System.out.println("Part 5) Lines 310 to 313; Overridden .compareTo method");

        System.out.println(phone1.compareTo(phone2)); // Line 310, 0
        System.out.println(phone1.compareTo(phone3)); // Line 311, -300
        System.out.println(phone3.compareTo(phone1)); // Line 312, 300
        System.out.println(phone1.compareTo("Hello!")); // Line 313, Failure


    }
    public static void main(String[] args) {
        driver();
    }
}

// .equals does not work for primitive types
// == operator
// 2 objects
// diff
// done
//== operator
//2 objects
//same
// done
//== operator
//2 objects
//diff
//
//2)
//.equals
//2 strings
//true
//
//.equals
//2 strings
//false
//
//.equals
//1 string 1 char
//false
//
//.equals
//1 string 1 char
//false
//
//3)
//compareTo
//2 strings
//true
//
//compareTo
//2 strings
//true
//
//compareTo
//2 strings
//-10
//
//compareTo
//2 strings
//10
//
//compareTo
//1 string 1 char
//error
//
//4) override
//.equals
//2 objects
//true
//
//.equals
//2 objects
//false
//
//.equals
//1 object 1 text
//false
//
//5)
//compareTo
//2 objects
//0
//
//compareTo
//2 objects
//-300
//
//compareTo
//2 objects
//300.
