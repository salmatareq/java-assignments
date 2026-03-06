package Service;

import data.Bank;
import enums.AccountType;
import factory.AccountFactory;
import models.BankAccount;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankService {
    Bank bank;

    public BankService(Bank bank) {
        this.bank = bank;
    }

    public void deposit(BankAccount account, BigDecimal amount) {
        account.deposit(amount);
    }

    public void withdraw(BankAccount account, BigDecimal amount) {

        account.withdraw(amount);

    }

    public BankAccount findAccount(int accountNumber) {
        for (BankAccount acc : bank.getAccounts()) {
            if (acc.getAccountNumber() == accountNumber) {
                return acc;
            }
        }
        return null;
    }

    public List<BankAccount> findAccountsByName(String customerName) {
        List<BankAccount> result = new ArrayList<>();
        for (BankAccount acc : bank.getAccounts()) {
            if (acc.getOwnerName().equalsIgnoreCase(customerName)) {
                result.add(acc);
            }
        }
        return result;
    }

    public BigDecimal totalAssets() {

        BigDecimal total = BigDecimal.ZERO;

        for (BankAccount account : bank.getAccounts()) {
            total = total.add(account.getBalance());
        }

        return total;
    }

    public BankAccount openAccount(AccountType type,
                                   String accountNumber,
                                  String extra) {

        AccountFactory accountFactory=new AccountFactory();
        BankAccount account = accountFactory.createAccount(type, accountNumber,extra);

        bank.addAccount(account);

        return account;
    }
}

