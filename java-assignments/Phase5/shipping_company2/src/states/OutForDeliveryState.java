package states;

import factory.StateFactory;
import interfaces.State;
import model.Product;

public class OutForDeliveryState  implements State {
    private Product product;
    public OutForDeliveryState(Product product){
        this.product=product;
    }

    @Override
    public void nextState() {
        product.setState(StateFactory.getState("DELIVERED",product));
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
