import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {

        // System.out.println("enter any number:");
        Scanner scan = new Scanner(System.in);
        // int a = scan.nextInt();
        // System.out.println("your entered number is:");
        // System.out.println(a);
        // System.out.println("enter your name:");
        // Scanner scan = new Scanner(System.in);
        // String name=scan.nextLine();
        // System.out.println("your name is:");
        // System.out.println(name);
        // System.out.println("enter your name,age,salary");
        // Scanner scan=new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        float salary = scan.nextFloat();
        System.out.println("your name is:" + name);
        System.out.println("your age is:" + age);
        System.out.println("your salary is:" + salary);

    }
}