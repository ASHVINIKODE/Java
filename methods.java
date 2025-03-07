public class methods {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a + " " + b);
        // it will not swap
        // passing example

        String name = "Ashvini";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam) {
        naam = "Ashi";
        //creating a new object .Not modifying

    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        // this is access in this func only not outside the func.

    }
}
