import java.util.*;
public class Basic2 {
    
    public static void main(String args[]) {
        // Print table of a number given by user
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1 ; i <= 10 ; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
