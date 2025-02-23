public class comparisonoperator {
    public static void main(String[] args) {
        // comparison operators are ==,<,>,!=,<=,>=;
        int a = 10;
        int b = 20;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        // assignment operator
        a = a + b;
        System.out.println(a);
        int c = 5;
        int d = 7;
        // c = c + d;
        // c+=d;
        // c-=d;
        // c/=d;
        // c*=d;
        c %= d;

        System.out.println(c);
//logical operator- &&(and),||(or),!(not);
     System.out.println(a==b && a==c);
     System.out.println(a==d || a==b);
     System.out.println(!(a==d || a==b));

    }
}