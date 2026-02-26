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


    public void addAccount(BankAccount account) {
        accounts.add(account);
    }


    public BankAccount findByOwner(String ownerName) {

        for (BankAccount account : accounts) {
            if (account.getOwnerName().equalsIgnoreCase(ownerName)) {
                return account;
            }
        }
        return null;
    }


    public BigDecimal totalAssets() {

        BigDecimal total = BigDecimal.ZERO;

        for (BankAccount account : accounts) {
            total = total.add(account.getBalance());
        }

        return total;
    }
}