public class scope {
    // scope basically means where we access our variables
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        String name = "Ashvini";

        {
            // int a=88; already initialized outside the block in the same method,hence you
            // cannot initialise again
            a = 76; // reassign the origin ref variable to some other value
            System.out.println(a);
            int c = 99;
            name = "Ashvii";
            System.out.println(name);
            // values initialized in this block will remain in the block.
        }
        // System.out.println(c); cannot use outside the block.\
        System.out.println(a);
        System.out.println(name);

    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
    // this change will only be valid in this scope only.
}
