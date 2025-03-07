import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        demo("aryan", "demon", "Stefan", "elena", "Bonny", "Jerermy", "Matt");
        demo(32, 65, 87, 34, 87, 34, 21, 54, 675, 3);

    }

    static void demo(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String... v) {
        System.out.println(Arrays.toString(v));
    }
}
