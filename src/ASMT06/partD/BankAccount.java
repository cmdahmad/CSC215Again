package ASMT06.partD;

public class BankAccount <T extends Currency> {

    T currency;

    BankAccount() {
        this.currency = (T) new USD();
    }

    BankAccount(T currency) {
        this.currency = currency;
    }

    String getDataType () {
        return this.currency.getClass().getSimpleName();
    }
}
