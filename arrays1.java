import java.util.Arrays;
import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str = new String[6];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        str[1] = "dgf";
        System.out.println(Arrays.toString(str));
    }
}
