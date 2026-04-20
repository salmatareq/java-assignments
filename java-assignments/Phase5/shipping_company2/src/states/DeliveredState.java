package states;

import factory.StateFactory;
import interfaces.State;
import model.Product;

public class DeliveredState  implements State {

    private Product product;
    public DeliveredState(Product product){
        this.product=product;
    }
    @Override
    public void nextState() {
        System.out.println("Already delivered. No next state.");
    }

    @Override
    public void handle() {
        System.out.println("Order has been delivered");

    }
    @Override
    public String toString() {
        return "DELIVERED";
    }
}
