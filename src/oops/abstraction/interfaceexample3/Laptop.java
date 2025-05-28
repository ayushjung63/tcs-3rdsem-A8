package oops.abstraction.interfaceexample3;

public class Laptop {
    public static void main(String[] args) {
        Charger charger=new AcerCharger();
        charger.charge();

        charger=new DellCharger();
        charger.charge();
    }
}
