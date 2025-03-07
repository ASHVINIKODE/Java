import javax.sound.sampled.SourceDataLine;

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
            System.out.println(c);
            // values initialized in this block will remain in the block.
        }
        int c = 87;
        System.out.println(c);
        // System.out.println(c); cannot use outside the block.\
        System.out.println(a);
        System.out.println(name);
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
            a = 10000;
        }
        System.out.println(a);
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }

    // this change will only be valid in this scope only.
}
// anything that is initialised outside cannot bee initialized inside but we can
// use it inside or update it inside and anything which can initialized inside
// cannot be used outside but we can initialize it outside .