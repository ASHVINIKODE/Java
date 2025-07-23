//Write a program to demonstrate constructor overloading using a Student class with different constructors
class Student {
    String name;
    int rollNo;
    String city;

    Student() {
        this.name = "unknown";
        this.rollNo = 0;
        this.city = "unknown";
    }

    Student(String name) {
        this.name = name;
        this.rollNo = 0;
        this.city = "unknown";
    }

    Student(int rollNo) {
        this.name = "unknown";
        this.rollNo = rollNo;
        this.city = "unknown";
    }

    Student(String name, int rollNo, String city) {
        this.name = name;
        this.rollNo = rollNo;
        this.city = city;
    }

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.city = "unknown";
    }

    Student(int rollNo, String city) {
        this.name = "unknown";
        this.rollNo = rollNo;
        this.city = city;
    }

    void printInfo() {
        System.out.println("Name:" + name);
        System.out.println("Roll no.:" + rollNo);
        System.out.println("City:" + city);
    }

}

public class oops8 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Riya");
        Student s3 = new Student(22);
        Student s4 = new Student("Nisha", 21, "Raipur");
        Student s5 = new Student("Aman", 22);
        Student s6 = new Student(22, "Pune");
        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
        s4.printInfo();
        s5.printInfo();
        s6.printInfo();

    }
}
