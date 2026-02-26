//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.




import data.Bank;
import exceptions.InvalidAmount;
import models.*;

import java.math.BigDecimal;


void main() {

        Bank bank = new Bank();


        SavingsAccount savings = new SavingsAccount("Salma");
        savings.setInterestRate(new BigDecimal("0.10"));

        CheckingAccount checking = new CheckingAccount("Ali");

        BusinessAccount business =
                new BusinessAccount("Omar", "TechCorp");


        bank.addAccount(savings);
        bank.addAccount(checking);
        bank.addAccount(business);


        savings.deposit(new BigDecimal("1000"));
        checking.deposit(new BigDecimal("500"));
        business.deposit(new BigDecimal("2000"));


        checking.withdraw(new BigDecimal("200"));

        savings.transfer(checking, new BigDecimal("100"));



        System.out.println(
                "Balance before interest: " + savings.getBalance()
        );
        savings.applyInterest();
        System.out.println(
                "Balance after interest: " + savings.getBalance()
        );
        try {
                savings.deposit(new BigDecimal("-100"));
        } catch (InvalidAmount e) {
                System.out.println("Exception: " + e.getMessage()+"\n");
        }
        business.chargefee();
        System.out.println("Transaction History of "+savings.getOwnerName());

       savings.printStatement();
        System.out.println();
        BankAccount found = bank.findByOwner("Salma");
        System.out.println("Found account balance: "
                + found.getBalance());


        System.out.println("Total Bank Assets: "
                + bank.totalAssets());
    }

