package model;

import interfaces.IShipping;
import interfaces.Ipackaging;

public class Product {
    private double weight;
    private IShipping shipping;
    private Ipackaging packagingType;
     public Product(double weight ){
         this.weight = weight;

     }
 public    void ShippingProduct(){
         shipping.shipping();
     }
    public void Packaging(){
         packagingType.packing();
    }

    public void setPackagingType(Ipackaging packagingType) {
        this.packagingType = packagingType;
    }
    public void setShipping(IShipping shipping){
         this.shipping=shipping;
    }

    public double getWeight() {
         return weight;
    }


}
