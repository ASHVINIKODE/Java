import java.util.Arrays;

public class stringMethod {
    public static void main(String[] args) {
        String name = "Ashvini Bhagat";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println(name.indexOf('v'));
    }
}
