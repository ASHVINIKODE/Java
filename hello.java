import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("Hello java!");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the fruit:");
        String Fruits=input.next();
        switch (Fruits) {
           case "Mango"->System.out.println("tasty fruit!");
           case "Orange"->System.out.println("round fruit!");
           case "Grapes"->System.out.println("small fruit!");
           case "Apple"->System.out.println("sweet fruit!");
           default->System.out.println("Pleaes enter the valid fruit!");
        }
    }
}
