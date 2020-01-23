package day46;

public class CheckingAccount extends BankAccount {

//no additional fields in checking account
//String accountHolder;
//    long accountNum;
//    double balance;


    public CheckingAccount(String accountHolder, long accountNum, double balance) {
        super(accountHolder, accountNum, balance);
    }
//this awesome bank account will give you 200$ if you deposit over $3000


    @Override
    public void Deposit(int amount) {
        if (amount >= 3000) {
            super.Deposit(amount + 200);
        } else {
            super.Deposit(amount);
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
