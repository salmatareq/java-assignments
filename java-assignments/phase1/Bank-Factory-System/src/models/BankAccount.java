package models;
import exceptions.InvalidAmount;
import utiles.ExceptionStrings;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount {

    private static int accountCounter = 0;
    protected int accountNumber;
    protected String ownerName;
    protected BigDecimal balance;
    protected List<String> transactionHistory;

    public BankAccount(String ownerName) {
        this.accountNumber = ++accountCounter;
        this.ownerName = ownerName;
        balance = BigDecimal.ZERO;
        this.transactionHistory = new ArrayList<>();
    }

    public BankAccount() {
        this("unknown");

    }

    public void deposit(BigDecimal amount) {
        if (!validation(amount)) {
            throw new InvalidAmount(ExceptionStrings.INVALID_AMOUNT);
        }
        BigDecimal newbalance = getBalance().add(amount);
        this.setBalance(newbalance);
        this.addHistory("Deposit", amount);
    }

    public void withdraw(BigDecimal amount) {
        if (!validation(amount)) {
            throw new InvalidAmount(ExceptionStrings.INVALID_AMOUNT);
        }
        BigDecimal newbalance = getBalance().subtract(amount);
        this.setBalance(newbalance);
        this.addHistory("Withdraw", amount);
    }

    protected boolean validation(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            return false;
        }
        return true;
    }

    protected void addHistory(String type, BigDecimal amount) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String formattedNow = now.format(dtf);

        this.transactionHistory.add(type + " " + amount.toString() + "EP " + formattedNow);
    }

    public void transfer(BankAccount target, BigDecimal amount) {
        this.withdraw(amount);
        target.deposit(amount);
        this.addHistory("transfer to " + target.accountNumber, amount);
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    private void setBalance(BigDecimal newbalance) {
        balance = newbalance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void printStatement() {
        for (String s : transactionHistory) {
            System.out.println(s);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

}
