public class recursion {
    public static void main(String[] args) {
        // write a fuction that prints hello world
        message();
    }

    static void message() {
        System.out.println("Hello world!");
        message1();
    }

    static void message1() {
        System.out.println("Hello java!");
        message2();
    }

    static void message2() {
        System.out.println("Hello guys!");
        message3();
    }

    static void message3() {
        System.out.println("Hello peps!");
        message4();
    }

    static void message4() {
        System.out.println("Hello boring peoples!");
        message5();
    }

    static void message5() {
        System.out.println("Okay byeee!");
    }
}