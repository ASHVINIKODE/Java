public class NestedIfElse {
    public static void main(String[] args) {
        //nested if else conditions;
        int age=19;
        String gender="male";
        boolean isResistered=true;
        if (age>18) {
            System.out.println("you are elegible!");
        }if(gender=="male"){
            System.out.println("you are invited!");

        }if(isResistered==true){
            System.out.println("you have account!");
        }else{
            System.out.println("you are not invited!");
        }
    }
}