package day46;

public class BankAccount {

    String accountHolder;
    long accountNum;
    double balance;

    public BankAccount(String accountHolder, long accountNum, double balance) {
        //super(); we have it here by defalt but we don't see it!!!
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public BankAccount() { //added no arg constructor to get rid of error in SavingAccount Class

    }

    public void Deposit(int amount) {
        balance += amount;
    }

    public void Withdraw(int amount) {

        balance -= amount;
    }


}
