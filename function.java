import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        greeting();
        sum();
        int ans = sum2();
        System.out.println(ans);

    }

    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Addition");
        System.out.println("Enter the first number:");
        int num1 = input.nextInt();
        System.out.println("Enter the second number:");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is:" + sum);
    }

    static void greeting() {
        System.out.println("Hello world!");
    }

    static int sum2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Addition");
        System.out.println("Enter the first number:");
        int num1 = input.nextInt();
        System.out.println("Enter the second number:");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is:" + sum);
        return sum;
    }
}
