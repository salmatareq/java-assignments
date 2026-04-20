package factory;

import interfaces.IShipping;
import strategy.ExpressShipping;
import strategy.NormalShipping;

public class ShippingFactory {
    public static IShipping create(boolean isExpress) {
        if (isExpress) {
            return new ExpressShipping();
        } else {
            return new NormalShipping();
        }
    }
}
