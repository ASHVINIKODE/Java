import java.util.Arrays;

public class functionOverloading {
    public static void main(String[] args) {
        func(11, 54, 76, 3, 48, 4, 87, 43, 984, 3, 65324, 78, 54, 32, 65, 87);
        func("yash", "Riya", "dev", "Ayan", "Shreya", "aryan");
        int ans = sum(2, 4, 3);
        // int ans = sum(2, 4);
        System.out.println("sum");
        System.out.println(ans);
    }

    static void func(int... v) {
        System.out.println("First one");  
        System.out.println(Arrays.toString(v));
    }

    static void func(String... x) {
        System.out.println("second one");
        System.out.println(Arrays.toString(x));
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static int sum(int a, int b) {
        return a + b;
    }
}
// two same functions can exist but the parameter must be different otherwise it
// will show error.
