public class String_builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
            // it is not creating new new object .it is just modifying the single object
        }
        System.out.println(builder.toString());
        // builder.deleteCharAt(0);
        // System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
    }
}
