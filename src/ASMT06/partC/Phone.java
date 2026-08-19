package ASMT06.partC;

import java.sql.SQLOutput;

public class Phone {

    int price;

    Phone (int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) { // @Override Equals Method
        if (!this.getClass().equals(o.getClass())) {
            System.out.print("'false' because of Incompatible type: ");
            return false;
        } else {
            boolean result = this.price == ((Phone) o).price;
            System.out.print( (result) ?
                    "'true' because of same values: "  :
                    "'false' because of difference values: ");
                    return result;
        }
    }
    public int compareTo(Object o ) {
        if (!this.getClass().equals(o.getClass())) {
            System.out.print("Failure to compare; Incompatible types: ");
            return -987654321;
        } else {
            if (this.price == ((Phone) o).price) {
                System.out.print("Same price so: ");
                return 0;
            } else {
                System.out.print("Difference in price: ");
                return this.price - ((Phone) o).price;
            }
        }

    }
}
