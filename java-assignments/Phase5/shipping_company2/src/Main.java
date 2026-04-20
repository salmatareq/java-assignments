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
    System.out.println(p1.getCurrentState());
    int t=3;
    while(t>0){
        System.out.print("next state is : ");
         p1.nextState();
        System.out.println("curret state is : "+p1.getCurrentState());

    t--;}
}
