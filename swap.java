import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=input.nextInt();
        System.out.println("Enter second number:");
        int b=input.nextInt();
        System.out.println("the numbers given are:" +a+" "+b);
        System.out.println("After swapping the numbers are:");
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
}
