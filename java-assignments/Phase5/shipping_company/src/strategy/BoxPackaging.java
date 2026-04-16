package strategy;

import interfaces.Ipackaging;

public class BoxPackaging implements Ipackaging {


    @Override
    public void packing( ) {
        System.out.println("Packaged in a box");
    }
}
