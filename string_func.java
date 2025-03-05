public class string_func {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
        String personalised=myGreet("Ashvinii");
        System.out.println(personalised);
    }
    static String myGreet(String name){
        String msg="Hey "+name;
        return msg;
    }

    static String greet() {
        String greeting = "How are you!";
        return greeting;
    }
}
