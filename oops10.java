//Create an abstract class Shape with an abstract method area(). Create classes Rectangle and Triangle that extend Shape and implement area().
abstract class Shape {
    abstract void area();
}

class Rectangle extends Shape {
    int length, width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        int result = length * width;
        System.out.println("Area of the rectangle:" + result);
    }
}

class Triangle extends Shape {
    int base, height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;

    }

    void area() {
        double result = 0.5 * base * height;
        System.out.println("Area of triangle:" + result);
    }
}

public class oops10 {
    public static void main(String[] args) {
        Shape tri = new Triangle(23, 54);
        Shape rec = new Rectangle(66, 2);
        rec.area();
        tri.area();
    }
}
