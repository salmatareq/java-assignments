package models;

import java.math.BigDecimal;



public class SavingsAccount extends BankAccount{
    private BigDecimal interestRate;

    public void applyInterest(){
       BigDecimal newamount=balance.multiply(interestRate);
       this.deposit(newamount);
    }


    public SavingsAccount(String ownerName){
        super(ownerName);
    }

       @Override
       public void withdraw(BigDecimal amount){
            BigDecimal newbalnce=balance.subtract(amount);
            if(newbalnce.compareTo(BigDecimal.valueOf(0))>-1){
                super.withdraw(amount);
            }
        }

       public  void deposit(BigDecimal amount){
        super.deposit(amount);
        }
    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }


}
