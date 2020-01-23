package day46;

public class SavingAccount extends BankAccount {

    //    String accountHolder;
//    long accountNum;
//    double balance;
    double interestRate;


    public SavingAccount(String accountHolder, long accountNum, double balance, double interestRate) {
        super(accountHolder, accountNum, balance); //called from BankAccount class
        this.interestRate = interestRate;

    }


    public static void main(String[] args) {

        SavingAccount s1 = new SavingAccount("Mohhamed", 1234, 50000, 0.042);
        System.out.println("s1 = " + s1);
        s1.Withdraw(10000);
        System.out.println("s1 = " + s1);

    }

    @Override //means use this version of constructor (with adjustments) rather then constructor from BankAccount
    public void Withdraw(int amount) {
        //balance=balance-amount;
        //balance=balance-30;
        super.Withdraw(amount);
        super.Withdraw(30);
    }

    @Override
    public void Deposit(int amount) {
        //super.Deposit(1000);
        //amount=amount+(amount*0.042);
        balance += amount + amount * interestRate;
        int actualAmount = (int) (amount + amount * interestRate);
        super.Deposit((actualAmount));

    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
