class Employee {
    String name;
    int salary;

    public void EmployeeDetails() {
        System.out.println("The name of the Employee is:" + this.name);
        System.out.println("The salary of the Employee is:" + this.salary);
    }
}

public class oops2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Rakesh Singh";
        emp1.salary = 32000;
        emp1.EmployeeDetails();

        Employee emp2 = new Employee();
        emp2.name = "Anu Mishra";
        emp2.salary = 30000;
        emp2.EmployeeDetails();
    }
}
