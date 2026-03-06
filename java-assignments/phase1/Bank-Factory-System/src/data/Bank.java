package data;



import models.BankAccount;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<BankAccount> accounts;


    public Bank() {
        accounts = new ArrayList<>();
    }

    public  List<BankAccount> getAccounts() {
        return accounts;
    }


    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

}