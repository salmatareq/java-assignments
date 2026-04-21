package states;

import factory.StateFactory;
import interfaces.State;
import model.Product;

public class PendingState implements State {

    @Override
    public void   nextState(Product  product) {

        product.setState(StateFactory.getState("SHIPPED"));

    }

    @Override
    public void handle() {
        System.out.println("Pebding. . .");
    }
    @Override
    public String toString() {
        return "Pending";
    }
}
