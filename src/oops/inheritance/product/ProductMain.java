package oops.inheritance.product;

public class ProductMain {
    public static void main(String[] args) {
        // method 1: setting values using getter
        DeliveryProduct d1=new DeliveryProduct();
        d1.setId(1);
        d1.setName("Samsung");
        d1.setPrice(500);
        d1.setDeliveryCharge(100);
        d1.setDeliveryLocation("Baneswor");

        System.out.println(d1.getName() +" "+ d1.getPrice() +" "+
                d1.getDeliveryCharge() +" "+ d1.getDeliveryLocation());

        // method 2: setting values using constructor
        DeliveryProduct d2=new DeliveryProduct(
                2,"Apple",1000,200,"Chabahil"
        );
        System.out.println(d2.getName() +" "+ d2.getPrice() +" "+
                d2.getDeliveryCharge() +" "+ d2.getDeliveryLocation());

//        NonDeliveryProduct d2=new NonDeliveryProduct();
//        d2.id=2;
//        d2.name="Apple";
//        d2.price=1000;
//        d2.pickupLocation="Apple Store";
//        System.out.println(d2.name +" "+ d2.price +" "+ d2.pickupLocation);
//
//        Product p1=new Product(2,"Samsung New Phone",2000);
//        System.out.println(p1.name +" "+ p1.price +" "+ p1.id);

    }
}
