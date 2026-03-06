import Service.BankService;
import data.Bank;
import enums.AccountType;
import models.BankAccount;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        BankService bankService = new BankService(bank);


        BankAccount checking1 = bankService.openAccount(AccountType.CURRENT, "Salma", "");
        BankAccount checking2 = bankService.openAccount(AccountType.CURRENT, "Ahmed", "");
        BankAccount savings1 = bankService.openAccount(AccountType.SAVINGS, "Salma", "");
        BankAccount business1 = bankService.openAccount(AccountType.BUSINESS, "CompanyOwner", "TechCorp");


        bankService.deposit(checking1, BigDecimal.valueOf(1000));
        bankService.deposit(checking2, BigDecimal.valueOf(500));
        bankService.deposit(savings1, BigDecimal.valueOf(2000));
        bankService.deposit(business1, BigDecimal.valueOf(5000));


        bankService.withdraw(checking1, BigDecimal.valueOf(200));
        bankService.withdraw(savings1, BigDecimal.valueOf(300));


        System.out.println("\n--- Transfer 150 from Salma checking to Ahmed checking ---");
        checking1.transfer(checking2, BigDecimal.valueOf(150));


        System.out.println("\n--- Find account by number ---");
        BankAccount found = bankService.findAccount(checking1.getAccountNumber());
        System.out.println("Found account owner: " + (found != null ? found.getOwnerName() : "not found"));

        System.out.println("\n--- Find accounts by owner name 'Salma' ---");
        for (BankAccount acc : bankService.findAccountsByName("Salma")) {
            System.out.println("Account #" + acc.getAccountNumber() + " balance: " + acc.getBalance());
        }


        System.out.println("\n--- Total assets in bank ---");
        System.out.println("Total assets: " + bankService.totalAssets());


        System.out.println("\n--- Test InvalidAmount exception on deposit ---");
        try {
            bankService.deposit(checking1, BigDecimal.ZERO);
        } catch (Exception ex) {
            System.out.println(  ex.getMessage());
        }

        System.out.println("\n--- Final balances and histories ---");
        printAccountSummary("Salma checking", checking1);
        printAccountSummary("Ahmed checking", checking2);
        printAccountSummary("Salma savings", savings1);
        printAccountSummary("Business account", business1);
    }

    private static void printAccountSummary(String label, BankAccount account) {
        System.out.println("\n[" + label + " - #" + account.getAccountNumber() + "]");
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Transactions:");
        account.printStatement();
    }
}

