import java.util.Arrays;

public class comparison {
    public static void main(String[] args) {
        String a = "Ashvini";
        String b = "Ashvini";
        System.out.println(a == b);
        // comparison of string
        // pointing the same value both a and b are equal.
        // it is creating value in pool inside heap

        // how to create different value of same object
        String c = new String("Bhagat");
        String d = new String("Bhagat");
        // creating these value outside the pool but in the heap
        System.out.println(c == d);
        // it will give value for because it have different values
        // when you only need to check value ,use .equals method.
        System.out.println(c.equals(d));
        // it will give value true

        String e = new String("heyyyyyy");
        String f = new String("HEllooooo");
        System.out.println(e == f);
        System.out.println(e.equals(f));
        // both will give false

        System.out.println(f.charAt(1));

        // output
        System.out.println(56);
        Integer num = new Integer(56);
        System.out.println(num.toString());
        System.out.println(num);
        System.out.println("Ashhh");
        System.out.println(Arrays.toString(new int[] { 2, 3, 4, 5 }));

        String name = null;
        System.out.println(name);
    }
}
