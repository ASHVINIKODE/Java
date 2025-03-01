import java.util.Scanner;

public class input_scanner {
    public static void main(String[] args) {
        // System.out.println("Enter the number:");
        // System.out.println("Enter the name:");
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // for (int i = 0; i <= n; i++) {
        // System.out.println(i);

        // }
        // String name = scn.nextLine();
        // System.out.println("hello " + name);
        // scn.close();
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        String name = scn.nextLine();
        System.out.println("dear " + name + ". here is the counting ");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            scn.close();
        }
    }
}