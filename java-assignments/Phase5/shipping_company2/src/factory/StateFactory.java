package factory;

import interfaces.State;
import model.Product;
import states.DeliveredState;
import states.OutForDeliveryState;

public class StateFactory {
    public static State getState(String type, Product product) {
        switch(type) {
            case "SHIPPED": return new OutForDeliveryState(product);
            case "DELIVERED": return new DeliveredState(product);
            default: throw new IllegalArgumentException();
        }
    }
}
