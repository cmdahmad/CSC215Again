package ASMT06.partD;

/********
 *  Name; Ahmad Mustafa
 *  Purpose: To demonstrate knowledge of generic classes
 *
 *
 *
 * ***/

public class main {
    public static void main(String [] args) {


        System.out.println("Here is a demonstration of line 344 and 345 from pkg17");
        BankAccount <Currency> acc1 = new BankAccount<>();
        System.out.println(acc1.getDataType());

        System.out.println();

        System.out.println("Here is a demonstration of line 348 and 349 from pkg17");
        BankAccount <EUR> acc2 = new BankAccount<>(new EUR());
        System.out.println(acc2.getDataType());
    }
}
