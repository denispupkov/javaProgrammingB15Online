package day46;

public class AtTheBank {

    public static void main(String[] args) {

        CheckingAccount acc1 = new CheckingAccount("Zehra", 54321, 10000);
        acc1.Deposit(100);
        System.out.println("acc1 = " + acc1);
        acc1.Deposit(5000);
        System.out.println("acc1 = " + acc1);
        acc1.Withdraw(5300);
        System.out.println("acc1 = " + acc1);
    }
}
