import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class multiDimension {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         * 1 2 3
         * 5 6 7
         * 8 5 7
         */
        // int[][]arr=new int[3][3];
        /*
         * int[][]arr={
         * {1,2,3},
         * {5,6,7},
         * {8,5,7}
         * };
         */
        int[][] arr = new int[3][3];
        System.out.println(arr.length); // No. of rows

        // Input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }

        // Output
        // for (int row = 0; row < arr.length; row++) {
        // for (int col = 0; col < arr[row].length; col++) {
        // System.out.print(arr[row][col] + " "); // Use print instead of println
        // }
        // System.out.println(); // Move to next line after printing a row
        // }
        // for (int row = 0; row < arr.length; row++) {
        // System.out.println(Arrays.toString(arr[row]));
        // }
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
        input.close(); // Close the Scanner
    }
}
// for(String element:arr){
//     System.out.println(element);
// }