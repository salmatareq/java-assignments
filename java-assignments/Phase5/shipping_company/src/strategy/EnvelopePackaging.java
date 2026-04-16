package strategy;

import interfaces.Ipackaging;

public class EnvelopePackaging implements Ipackaging {
    @Override
    public void packing( ) {
        System.out.println("Packaged in an envelope");
    }
}
