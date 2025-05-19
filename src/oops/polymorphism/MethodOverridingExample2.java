package oops.polymorphism;

class Vehicle {
    public void move() {
        System.out.println("This is a normal 2 wheeler");
    }
}

class Car extends Vehicle {
    public void move() {
        System.out.println("This is a 4 wheeler car");
    }
}

class SideCarBike extends Vehicle {
    public void move() {
        System.out.println("This is a 3 wheeler Side Car Bike");
    }
}

class Truck{
    public void move() {
        System.out.println("This is a Truck");
    }
}


public class MethodOverridingExample2 {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.move();

        v=new Car();
        v.move();

        v=new SideCarBike();
        v.move();

    }
}
