import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        input.close();  // Close the scanner to prevent resource leak
        System.out.println(isArmstrong(n));  // Pass the correct number
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = countDigits(n);  // Count the number of digits in n

        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, digits);  // Raise each digit to the power of 'digits'
            n /= 10;
        }
        return sum == original;
    }

    static int countDigits(int num) {
        return String.valueOf(num).length();  // Convert number to string and get length
    }
}
