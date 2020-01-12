package day40;

public class BankAccount {

    String accountType;
    String accountHolder;
    long accauntNumber;
    double balance;

    //setAllTheValue
    public void setAllTheValue(String newAccountType, String newAccountHolder, long newAccountNumber, double newBalance) {

        accountType = newAccountType;
        accountHolder = newAccountHolder;
        accauntNumber = newAccountNumber;
    }

    //showAccountBalance

    public void showAccountBalance() {

        System.out.println("current balance = " + balance);
    }
    //showAccountHolderType

    public void setAccountHolderAccountType() {
        System.out.println("accountType = " + accountType);
    }

    //getBalance "return balance"
    public double getBalance() {
        return balance;
    }

    //deposit (amount)

    public void deposit(double amount) {
        balance = balance + amount;

    }


    //withdraw (amount)
    public void withdraw(double amount) {
        balance += amount;
    }

    //withdraw100Cash()
    public void withdraw100Cash() {
        withdraw(100);
    }

    //purchaseProduct(price,count)

    public void purchaseProduct(double productPrice, int count) {
        double totalPrice = productPrice * count;
        balance -= totalPrice;
        // or withdraw(totalPrice);
    }

    //toString


    public String toString() {
        return "BankAccount{" +
                "accountType='" + accountType + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accauntNumber=" + accauntNumber +
                ", balance=" + balance +
                '}';
    }
}
