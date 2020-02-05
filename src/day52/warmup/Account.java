package day52.warmup;

public class Account implements Transferable, Comparable<Account> {

    protected String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;

    }

    @Override
    public void transferAll(Account otherAccount) {
//get the balance of current account
        //deposit to the other account
        //set current account balance to 0
        otherAccount.balance += this.balance; // 1 way
        this.balance = 0; // 1 way

//otherAccount.deposit(this.balance); //2 way
//this.withdraw(this.balance); //2 way


    }


    public int getBalance() {
        return balance;
    }


    public void deposit(int amount) {
        balance += amount;
    }


    public void withdraw(int amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public boolean isPalindrome() {
//first store it into temp and replace all the space and make it lowercase
        String temp = this.name.toLowerCase().replace(" ", "");
//we need to reverse the value then check they are the same String or not
        String reverseResult = "";
        for (int i = temp.length() - 1; i >= 0; i--) {
            reverseResult += temp.charAt(i);
        }


        return temp.equals(reverseResult);
    }

    //add logic to compare by balance
    @Override
    public int compareTo(Account otherAccount) {
        if (this.balance > otherAccount.balance) {
            return 1;
        } else if (this.balance < otherAccount.balance) {
            return -1;
        } else {
            return 0;
        }
    }


}
