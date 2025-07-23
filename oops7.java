// Create a class Circle with a private radius. Provide methods to set and get the radius and calculate the area. Use encapsulation.
class Circle {
    private double radius;

    public void setRadius(double radius) {
        if (radius > 0)
            this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

}

public class oops7 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5.0);
        System.out.println("Radius of the circle:" + c.getRadius());
        System.out.println("Area of the circle:" + c.getArea());

    }
}
