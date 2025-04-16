public class memoryPerformance_of_string {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            System.out.print(ch + " ");
            series = series + ch;

        }
        String numbers = "";
        for (int i = 1; i < 101; i++) {
            int num = (int) (i);
            System.out.print(num + " ");
            //it is not a good method and here is lots of wastage of memory and it is creating new objects again and again so thats why we have to use stringbuilder. 
        }
        System.out.println(series);
    }
}
// important
