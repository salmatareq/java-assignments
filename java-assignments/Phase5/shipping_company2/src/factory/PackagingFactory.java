package factory;

import interfaces.Ipackaging;
import strategy.BoxPackaging;
import strategy.EnvelopePackaging;

public class PackagingFactory {

public static Ipackaging create(double weight) {
    if (weight < 2) {
        return new EnvelopePackaging();
    } else {
        return new BoxPackaging();
    }
}}
