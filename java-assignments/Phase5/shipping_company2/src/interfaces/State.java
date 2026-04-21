package interfaces;

import model.Product;

public interface State {
    public void nextState(Product product);
    public void handle();

}
