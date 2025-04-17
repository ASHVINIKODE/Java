public class NumbersExample {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers:1 2 3 4 5
        print1(1);
        // print1(1);
        // print1(2);
        // print1(3);
        // print1(4);
        // print1(5);

    }

    static void print1(int n) {
        System.out.println(n);
        print2(2); // calling method print2 after print1
    }

    static void print2(int n) {
        System.out.println(n);
        print3(3);// calling method print3 after print2
    }

    static void print3(int n) {
        System.out.println(n);
        print4(4);// calling method print3 after print4
    }

    static void print4(int n) {
        System.out.println(n);
        print5(5);// calling method print5 after print4
    }

    static void print5(int n) {
        System.out.println(n);
    }
    // recursion:function calling another function and function which call itself
}

// how function calls works in languages
// in stack memory--> main->print1()->print2(2)->print3(3)->print4(4)->print5(5)
// output->1 2 3 4 5
// while the function is not finish executing it will return in stack
// when the function finish executing it is removed from the stack ,and the flow
// of program is restored to where the function is called.