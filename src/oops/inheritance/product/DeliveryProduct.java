package oops.inheritance.product;

public class DeliveryProduct extends Product {
    private int deliveryCharge;
    private String deliveryLocation;

    // default constructor
    public DeliveryProduct() {}

    // param/args constructor
    public DeliveryProduct(int id,String name, int price, int deliveryCharge, String deliveryLocation) {
        // since id,name and price are private in parent class
        // we use super constructor i.e call parent constructor to set their values
        super(id, name, price);
        this.deliveryCharge = deliveryCharge;
        this.deliveryLocation = deliveryLocation;
    }

    public int getDeliveryCharge() {
        return deliveryCharge;
    }

    public void setDeliveryCharge(int deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }
}
