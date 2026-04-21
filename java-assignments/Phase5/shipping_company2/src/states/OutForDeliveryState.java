package states;

import factory.StateFactory;
import interfaces.State;
import model.Product;

public class OutForDeliveryState  implements State {

    @Override
    public void nextState(Product  product) {
        product.setState(StateFactory.getState("DELIVERED"));
    }

    @Override
    public void handle() {
        System.out.println("Order is out for delivery");
    }
    @Override
    public String toString() {
        return "out for delivery";
    }
}
