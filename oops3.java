class Car {
    String model;
    int year;

    public void CarDetails() {
        System.out.println("Model:" + this.model);
        System.out.println("Year:" + this.year);
    }
}

public class oops3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = "Hyundai i20";
        c1.year = 2022;
        c1.CarDetails();
        Car c2 = new Car();
        c2.model = "Honda city";
        c2.year = 2023;
        c2.CarDetails();
    }
}
