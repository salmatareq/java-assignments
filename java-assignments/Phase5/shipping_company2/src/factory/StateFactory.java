package factory;

import interfaces.State;
import model.Product;
import states.DeliveredState;
import states.OutForDeliveryState;

public class StateFactory {
    public static State getState(String type ) {
        switch(type) {
            case "SHIPPED": return new OutForDeliveryState();
            case "DELIVERED": return new DeliveredState();
            default: throw new IllegalArgumentException();
        }
    }
}
