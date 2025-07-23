// Create a class Car with attributes brand, model, and price. Write a method to display car details. Create 2 objects and call the method.

class Car {
    String brand, model;
    double price;

    public void printInfo() {
        System.out.println("Brand:" + this.brand);
        System.out.println("Model:" + this.model);
        System.out.println("Price:" + this.price);
    }
}

public class oops6 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.model = "Corolla";
        c1.price = 1200000;
        c1.printInfo();
        Car c2 = new Car();
        c2.brand = "Kia";
        c2.model = "Seltos";
        c2.price = 1200000;
        c2.printInfo();

    }
}
