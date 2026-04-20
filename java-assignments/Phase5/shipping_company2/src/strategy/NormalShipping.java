package strategy;

import interfaces.IShipping;

public class NormalShipping implements IShipping {


    @Override
    public void shipping() {
        System.out.println("NormalShipping");
    }
}
