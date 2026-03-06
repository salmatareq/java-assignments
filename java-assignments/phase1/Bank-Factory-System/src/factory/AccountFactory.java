package factory;

import enums.AccountType;
import models.BankAccount;
import models.BusinessAccount;
import models.CheckingAccount;
import models.SavingsAccount;

public class AccountFactory implements Ifactory {

    @Override

    public BankAccount createAccount(AccountType type, String name, String extra) {

        switch (type) {
            case SAVINGS:
                return new SavingsAccount(name);
            case CURRENT:
                return new CheckingAccount(name);
            case BUSINESS:
                return new BusinessAccount(name, extra);
            default:
                throw new IllegalArgumentException("Invalid account type");
        }
    }

    public AccountFactory() {

    }
}

