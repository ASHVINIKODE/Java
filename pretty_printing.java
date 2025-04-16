public class pretty_printing {
    public static void main(String[] args) {
        // % means a placeholder
        float a = 453.2395f;
        System.out.printf("Formatted number is %.2f", a);
        // printf for formatted string
        // it also give rounding off value
        System.out.println();
        System.out.printf("PI: %.2f", Math.PI);
        System.out.println();
        System.out.printf("Hello my name is %s and my surname is %s", "Ashvini", "Bhagat");
    }
}
