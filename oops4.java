class Mobile {
    String brand;
    int price;

    public void getInfo() {
        System.out.println("Brand:" + this.brand);
        System.out.println("Price:" + this.price);
    }

    Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
}

public class oops4 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", 150000);
        m1.getInfo();
        Mobile m2 = new Mobile("Apple", 180000);
        m2.getInfo();
    }
}
