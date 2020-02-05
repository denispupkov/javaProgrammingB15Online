package day52.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting {

    public static void main(String[] args) {


        List<Account> accountList = new ArrayList<>();
        accountList.add(new Account("John Snow", 10000));
        accountList.add(new Account("Vlad", 11000));
        accountList.add(new Account("Svetlana", 13000));
        accountList.add(new Account("Muhhamed", 8000));
        accountList.add(new Account("Anna", 17000));
        accountList.add(new Account("Ata", 15000));
        System.out.println("accountList BEFORE = " + accountList);
        Collections.sort(accountList);
        System.out.println("accountList AFTER = " + accountList);


        Account d1 = new Account("Denis", 0);
        for (Account each : accountList) {
            each.transferAll(d1);
        }
        System.out.println("d1 = " + d1);

        System.out.println("accountList = " + accountList);

        Account a1 = new Account("Polymorphism", 10000);
        Transferable t1 = a1;
        Comparable c1 = new Account("Polimorphism", 7000);
        Object o1 = c1;


    }
}
