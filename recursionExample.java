public class recursionExample {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        if (n == 1000) {
            System.out.println(1000);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
}
