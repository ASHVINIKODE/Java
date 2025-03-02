import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Addition");
        System.out.println("Enter the first number:");
        int num1 = input.nextInt();
        System.out.println("Enter the second number:");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is:" + sum);

        System.out.println("Subtraction");
        System.out.println("Enter the first number:");
        int num3 = input.nextInt();
        System.out.println("Enter the second number:");
        int num4 = input.nextInt();
        int sum1 = num3 - num4;
        System.out.println("The result is:" + sum1);

        System.out.println("Multiplication");
        System.out.println("Enter the first number:");
        int num5 = input.nextInt();
        System.out.println("Enter the second number:");
        int num6 = input.nextInt();
        int sum3 = num5 * num6;
        System.out.println("The result is:" + sum3);

        System.out.println("Division");
        System.out.println("Enter the first number:");
        int num7 = input.nextInt();
        System.out.println("Enter the second number:");
        int num8 = input.nextInt();
        int sum4 = num7 / num8;
        System.out.println("The result is:" + sum4);
    }
}
