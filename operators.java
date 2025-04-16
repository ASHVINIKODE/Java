import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println('b' + 3);
        System.out.println((char) ('a' + 6));// casting
        System.out.println("a" + 1);
        // this is same as after a few steps:"a" + "1"
        // Integer will be converted to Integer that will call toString
        System.out.println("a" + "1");
        System.out.println("Ashvini" + new ArrayList<>());
        System.out.println("Ashvini" + new Integer(56));
        String ans = "Ashvini" + new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);
    }
}
