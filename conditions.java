public class conditions {
    public static void main(String[] args) {
        // if else and if else if conditions;
        int a = 15;
        if (a == 10) {
            System.out.println("yes! you are right");
        } else if (a == 15 && a == 10) {
            System.out.println("second case is also right!");
        } else if (a == 15 || a == 10) {
            System.out.println("third case is also correct!");
        }

        // else if (!(a==15)) {
        // System.out.println("you are right!");
        // }
        else {
            System.out.println("you are wrong!");
        }
        int x = 10;
        if (x % 2 == 0) {
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }
        System.out.println("hardwork is better than smartwork");
        int n1 = 10;
        int n2 = 8;
        if (n1 == n2) {
            System.out.println(n1 + " is equal to " + n2);
        } else {
            if (n1 > n2) {
                System.out.println(n1 + " is greater than " + n2);
            } else {
                System.out.println(n1 + " is smaller than " + n2);
            }
        }
        int k1 = 30;
        int k2 = 30;
        if (k1 == k2) {
            System.out.println(k1 + " is equal to " + k2);
        } else if (k1 > k2) {
            System.out.println(k1 + " is greater than " + k2);
        } else {
            System.out.println(k1 + " is smaller than " + k2);
        }
        int marks = 65;
        if (marks > 90) {
            System.out.println("excellent");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("good");
        } else if (marks > 70 && marks <= 80) {
            System.out.println("fair");
        } else if (marks > 60 && marks <= 70) {
            System.out.println("meets expectations");
        } else {
            System.out.println("below par");
        }

    }
}