import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = input.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            System.out.println("It is not prime number");
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                System.out.println("It is not prime number");
                return false;
            }
            c++;
        }
        System.out.println("It is prime number");
        return c * c > n;

    }
}
