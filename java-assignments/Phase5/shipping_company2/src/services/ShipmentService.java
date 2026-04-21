package services;

import factory.PackagingFactory;
import factory.ShippingFactory;
import interfaces.IShipping;
import interfaces.Ipackaging;
import interfaces.State;
import model.Product;

public class ShipmentService {
    public void processShipment(Product product, boolean isExpress) {


        Ipackaging packaging =
                PackagingFactory.create(product.getWeight());


        product.setPackagingType(packaging);


        IShipping shipping =
                ShippingFactory.create(isExpress);

        product.setShipping(shipping);
    }
    public void moveToNextState(Product product) {
        product.nextState();
    }

    public State getCurrentState(Product product) {
       return product.getCurrentState();
    }
}
