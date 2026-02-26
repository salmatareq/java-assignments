package models;

import exceptions.InvalidAmount;
import utiles.ExceptionStrings;

import java.math.BigDecimal;

public class BusinessAccount extends CheckingAccount{
private String companyName;
    private static int accountCounter=0;

    public BusinessAccount(String ownerName,String companyName){


        this(ownerName,companyName,BigDecimal.valueOf(2000));
    }
    public BusinessAccount(String ownerName,String companyName,BigDecimal overdraftLimit){
        super(ownerName,overdraftLimit);
        this.companyName=companyName;
    }

public void chargefee(){
this.withdraw(BigDecimal.valueOf(25));

}

}
