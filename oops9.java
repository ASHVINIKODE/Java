//Create a class Person with a method speak(). Create another class Teacher that extends Person and overrides speak(). Demonstrate runtime polymorphism.
class Person {
    void speak() {
        System.out.println("Person is speaking..........");
    }
}

class Teacher extends Person {
    void speak() {
        System.out.println("Teacher is teaching............");
    }
}

public class oops9 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Teacher t1 = new Teacher();
        Person p2 = new Teacher();
        p1.speak();
        t1.speak();
        p2.speak();
    }
}
