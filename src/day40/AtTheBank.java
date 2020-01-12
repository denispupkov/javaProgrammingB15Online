package day40;

public class AtTheBank {

    public static void main(String[] args) {


        BankAccount b1 = new BankAccount();
        b1.setAllTheValue("Saving", "Denis", 123456789, 10000);
        b1.showAccountBalance();
        b1.setAccountHolderAccountType();
        b1.deposit(3000);
        b1.withdraw(12000);
        b1.purchaseProduct(120, 3);

        System.out.println(b1.balance);
    }
}
