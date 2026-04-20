package model;

import interfaces.IShipping;
import interfaces.Ipackaging;
import interfaces.State;
import states.DeliveredState;
import states.OutForDeliveryState;
import states.PendingState;

public class Product {
    private double weight;
    private IShipping shipping;
    private Ipackaging packagingType;
    private State currentState;
    State pendingState;
    State shippedState;
    State deliveredState;

    public Product(double weight) {
        this.weight = weight;
        pendingState = new PendingState(this);
        shippedState = new OutForDeliveryState(this);
        deliveredState = new DeliveredState(this);
        currentState = pendingState;
    }

    public void ShippingProduct() {
        shipping.shipping();
    }

    public void Packaging() {
        packagingType.packing();
    }

    public void setPackagingType(Ipackaging packagingType) {
        this.packagingType = packagingType;
    }

    public void setShipping(IShipping shipping) {
        this.shipping = shipping;
    }

    public double getWeight() {
        return weight;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void nextState() {
        currentState.nextState();
        currentState.handle();
    }

}
