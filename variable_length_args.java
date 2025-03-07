import java.util.Arrays;

public class variable_length_args {
    public static void main(String[] args) {
        multiple(2, 3, "anishka", "riya", "diya");
        fun(1, 2, 3, 4, 5, 6, 7, 33, 45, 65, 23, 65, 32, 3);

    }

    static void multiple(int a, int b, String... t) {
        System.out.println(Arrays.toString(t));
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
