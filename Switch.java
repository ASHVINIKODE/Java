import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the fruit:");
        String fruits = input.next();
        switch (fruits) {
            case "Mango" -> System.out.println("King of fruits");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruits");
            case "Strawberry" -> System.out.println("Tasty fruits");
            case "Apple" -> System.out.println("Sweet fruits");
            default -> System.out.println("Enter the valid fruit.");
        }
    }
}
