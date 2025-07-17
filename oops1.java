class Pen {
    String color;
    String type;

    public void printclr() {
        System.out.println("The color of the pen is:" + this.color);
        System.out.println("The type of the pen is:" + this.type);
    }
}

public class oops1 {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Red";
        pen1.type = "Gel pen";
        pen1.printclr();

        Pen pen2 = new Pen();
        pen2.color = "Blue";
        pen2.type = "Ballpoint pen";
        pen2.printclr();
    }
}
