// class FirstName  {
//      public static void main(String args[]) {
//         System.out.println("Hello World");
//         System.out.println("Hello , how are you ?");
//     }

// }

import java.util.*;

class FirstName {
    public static void main (String args[]){
       
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);
        // Take two numbers from user and print their sum

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println(sum);

    }
}