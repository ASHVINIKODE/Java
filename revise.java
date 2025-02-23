import java.util.Scanner;

public class revise {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hey Ashviii this side!");
        System.out.println(33567);
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());
        System.out.println(input.next());
        System.out.println(input.nextLine());
        int rollNo = 35;
        char letter = 'a';
        double largeDecimalNumbers = 648624242.47827;
        float marks = 98.67f;
        long largeInteger = 45783242L;
        boolean check = false;
        System.out.println(rollNo);
        System.out.println(letter);
        System.out.println(largeDecimalNumbers);
        System.out.println(marks);
        System.out.println(largeInteger);
        System.out.println(check);
        System.out.println("Please enter your roll number:");
        int rollNoo = input.nextInt();
        System.out.println("Your Roll number is:" + rollNoo);
        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("helloooo!" + name);
        System.out.println("Enter your marks:");
        float markss = input.nextFloat();
        System.out.println("your marks is:" + markss);
        System.out.println("Enter the first number:");
        int num1 = input.nextInt();
        System.out.println("Enter the second number:");
        int num2 = input.nextInt();
        System.out.println("The value of first number is:" + num1);
        System.out.println("The value of second number is:" + num2);
        int sum = num1 + num2;
        System.out.println("The sum of first and second number is:" + sum);
        // type casting
        int num = (int) (67.56f);
        System.out.println(num);
        // Automatic type promotion in expressions
        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a * b / c;
        System.out.println(d);
        int number = 'a';
        System.out.println(number);
        System.out.println("你好");
        byte s = 42;
        char t = 'a';
        short u = 1024;
        int v = 50000;
        float w = 5.67f;
        double x = 0.1234;
        double result = (w * s) + (v / t) - (x * u);
        // float+int-double=double
        System.out.println((w * s) + " " + (v / t) + " " + (x * u));
        System.out.println(result);
        if (true) {
            System.out.println("hello everyone");
        }
        System.out.println("enter the value of z:");
        int z = input.nextInt();
        if (z == 10) {
            System.out.println("The value of z is:" + z);
        } else {
            System.out.println("the value of z is not 10");
        }
        int count = 1;
        while (count != 5) {
            System.out.println(count);
            count++;
        }
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }

    }
}