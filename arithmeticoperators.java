//arithmetics operators are used to perform operations.
//types of arithmetic operators are-arithmetic operator,assignment operator,unary,shift,relational,bitwise,logical,ternary.
public class arithmeticoperators {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        // unary operator a++(post increment),a--(post
        // decrement),--a(predecrement),++a(pre increment);
        a++;
        System.out.println(a);
        b--;
        System.out.println(b);
        int c = 30;
        --c;
        System.out.println(--c);
        int d = 40;
        ++d;
        System.out.println(++d);
        boolean bool1 = true;
        System.out.println(bool1);
        boolean bool2 = !true;
        System.out.println(bool2);
        boolean bool3=false;
        System.out.println(bool3);
        boolean bool4=!false;
        System.out.println(bool4);

    }
}