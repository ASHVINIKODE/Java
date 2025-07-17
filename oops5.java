class Laptop {
    String brand;
    int ram;
    int price;

    public void getInfo() {
        System.out.println("brand:" + this.brand);
        System.out.println("ram:" + this.ram);
        System.out.println("Price:" + this.price);

    }

    Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }
}

public class oops5 {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("HP", 8, 650000);
        l1.getInfo();
        Laptop l2 = new Laptop("Dell", 8, 770000);
        l2.getInfo();
    }
}
