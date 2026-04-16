package strategy;

import interfaces.IShipping;

public class ExpressShipping implements IShipping {

    @Override
    public void shipping() {
        System.out.println("ExpressShipping");
    }
}
