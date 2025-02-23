import java.util.Scanner;

public class ConditionsWithInput {
    public static void main(String[] args) {
        System.out.println("Please enter your age:");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        // System.out.println("your age is:"+age);
        if (age > 18) {
            System.out.println("welcome to the club!");

        }else if (12<age && age<=18) {
            System.out.println("you can join the teen club...");
        }else if (age>=5 && age<=12) {
            System.out.println("you can join the kids club...");
        } else {
            System.out.println("you are not allowed...");
        }
    }
}