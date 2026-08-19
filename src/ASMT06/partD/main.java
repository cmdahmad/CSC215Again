package ASMT06.partD;

/**********************************************************************************************
 *
 * File: [main.java]
 * By: [Ahmad Mustafa]
 * Date: [08/16/2026]
 *
 * Description: The purpose of this code is to demonstrate my knowledge of Generic data types '<T>'.
 *
 * ***********************************************************************************************/

public class main {
    public static void main(String [] args) {


        System.out.println("Here is a demonstration of line 344 and 345 from pkg17");
        BankAccount <Currency> acc1 = new BankAccount<>();
        System.out.println("Currency: " + acc1.getDataType());

        System.out.println();

        System.out.println("Here is a demonstration of line 348 and 349 from pkg17");
        BankAccount <EUR> acc2 = new BankAccount<>(new EUR());
        System.out.println("Currency: " + acc2.getDataType());
    }
}
