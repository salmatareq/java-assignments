package sampleA;


import java.math.BigDecimal;

// SRP violation
//public class Invoice {
//    private Order order;
//    public double calculateTotal()  { /* business logic */ }
//    public void printInvoice()      { /* print formatting */ }
//    public void saveToDatabase()    { /* JDBC SQL calls   */ }
//    public void sendByEmail()       { /* SMTP logic       */ }
//}
public class Invoice {
    private Order order;

    Invoice() {
        order = new Order();
    }

    public double calculateTotal() {
        double total = 0;
        return total;
    }

    public Order getOrder() {
        return order;
    }

}
