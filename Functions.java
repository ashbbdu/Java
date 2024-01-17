import java.util.*;

public class Functions {

    public static int printSum (int a , int b) {
        return a + b;
    }

    public static String printName (String name) {
        return name;
        
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // String op = printName(name);
        // System.out.println("Name is " + op);

        System.out.println("Enter First Number !");
        int a = sc.nextInt();;
        System.out.println("Enter Second Number !");
        int b = sc.nextInt();
        int sum = printSum(a , b);
        System.out.println("Total of two numbers is " + sum);
    }
}