import java.util.ArrayList;
import java.util.Scanner;

public class arrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(88);
        list.add(8854);
        list.add(883);
        list.add(88543);
        list.add(838);
        list.add(881);
        list.add(488);
        list.add(858);
        list.add(488);
        list.add(848);
        list.add(884);
        list.add(988);
        list.add(898);
        list.add(888);
        list.add(588);
        list.add(878);
        list.add(868);
        list.add(885);
        list.add(588);
        list.add(868);
        list.add(888);
        list.add(889);
        list.add(2288);
        list.add(832328);
        list.add(8832);
        list.add(883);
        list.add(8832);
        list.add(8865);
        System.out.println(list);
        System.out.println();
        System.out.println(list.contains(8865));
        System.out.println();
        System.out.println(list.contains(45678));
        System.out.println();
        list.set(0, 678);
        list.remove(2);
        System.out.println(list);
        // input
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        // System.out.println(list);
    }
}
