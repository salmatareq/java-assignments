import model.Product;
import services.ShipmentService;


void main() {

    Product p1 = new Product(3.5);

    ShipmentService service = new ShipmentService();
    service.processShipment(p1,true);


    Product p2 = new Product(1);

    service.processShipment(p2,true);
p1.Packaging();
p2.Packaging();


}
