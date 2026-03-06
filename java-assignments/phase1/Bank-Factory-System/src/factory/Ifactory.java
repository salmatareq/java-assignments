package factory;

import enums.AccountType;
import models.BankAccount;

public interface Ifactory {
    public  BankAccount createAccount(AccountType type, String name, String extra);
}
