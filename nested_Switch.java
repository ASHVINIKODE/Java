import java.util.Scanner;

public class nested_Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee ID:");
        int empID = input.nextInt();
        System.out.println("Enter Department:");
        String department = input.next();
        switch (empID) {
            case 1 -> System.out.println("Rohan Verma");
            case 2 -> System.out.println("priya Mishra");
            case 3 -> {
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "MANAGEMENT" -> System.out.println("Department of Management");
                    default -> System.out.println("Invalid Department entered.");
                }
            }
            default -> System.out.println("Invalid employee ID");
        }
        input.close();
    }
}
