package states;

import factory.StateFactory;
import interfaces.State;
import model.Product;

public class PendingState implements State {
   private Product product;
    public PendingState(Product product){
        this.product=product;
    }
    @Override
    public void   nextState() {

        product.setState(StateFactory.getState("SHIPPED",product));

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
