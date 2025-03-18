import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int[] rollno = new int[5];
        System.out.println(rollno[1]);
        System.out.println(rollno[4]);
        String[] arr = new String[5];
        System.out.println(arr[1]);
        System.out.println(arr[3]);
        // declaration and initialisation of array.
//array of primitives
        Scanner input = new Scanner(System.in);
        int ar[] = new int[5];
        ar[0] = 1;
        ar[1] = 34;
        ar[3] = 19;
        ar[4] = 76;
        ar[2] = 54;
        System.out.println(ar[3]);
        System.out.println("enter the numbers:");
        for (int i = 0; i < ar.length; i++)

        {

            ar[i] = input.nextInt();
        }
        for (int i = 0; i < ar.length; i++)

        {
            System.out.print(ar[i] + " ");
            System.out.println();
        }
        for (int num : ar) {
            System.out.print(num + " ");
        }
    }
}
