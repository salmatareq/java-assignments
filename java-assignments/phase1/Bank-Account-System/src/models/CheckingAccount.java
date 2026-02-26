package models;

import java.math.BigDecimal;

public class CheckingAccount extends BankAccount{
   protected  BigDecimal overdraftLimit;
    public CheckingAccount(String ownerName,BigDecimal overdraftLimit){
        super(ownerName);
        this.overdraftLimit=overdraftLimit;
    }

    public CheckingAccount(String ownerName){

    this(ownerName, BigDecimal.valueOf(500));

}

    public CheckingAccount() {
    }
    @Override
    public void withdraw(BigDecimal amount){
    BigDecimal newbalnce=balance.subtract(amount);

        if(newbalnce.compareTo(overdraftLimit.negate()) >= 0)
        super.withdraw(amount);
    }
    }




