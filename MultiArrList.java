import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        // add elememt
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                list.get(i).add(input.nextInt());

            }

        }

        System.out.println(list);
     

    }
}
