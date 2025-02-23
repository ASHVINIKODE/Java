import java.util.Scanner;

public class revise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the salary:");
        float salary = input.nextFloat();
        if (salary == 50000) {
            System.out.println("ashvii salary is:" + salary);
        } else {
            System.out.println("someone else salary");
        }
        // print no. from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("enter the value of n:");
        int n = input.nextInt();
        for (int num = 1; num <= n; num++) {
            System.out.println(num);
        }
        System.out.println("Enter the value of a:");
        int a = input.nextInt();
        System.out.println("Enter the value of b:");
        int b = input.nextInt();
        System.out.println("Enter the value of c:");
        int c = input.nextInt();
        // Find the largest of the three number
        if (a > b && a > c) {
            System.out.println("a is the largest number:" + a);
        } else if (b > a && b > c) {
            System.out.println("b is the largest number:" + b);
        } else if (c > b && c > a) {
            System.out.println("c is the largest number:" + c);
        }
        System.out.println("Enter the alphabet:");
        char ch = input.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}