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

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter First Digit");

        // int a = sc.nextInt();
        // System.out.println("Enter Last Digit");
        // int b = sc.nextInt();

        // int sum = a + b;
        // System.out.println(sum);

        // int n = 4;
        // int m = 5;

        // for(int row = 0 ; row < n ; row++) {
        //     for(int col = 0 ; col < m ; col++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        System.out.println("ashish");
        System.out.println("Srivastava");

        // star pattern

        int stars = 5;

                // star pattern


                for(int row = 0 ; row < stars  ; row++) {
                    // gaps
                    for(int col = 0 ; col < stars - row ; col++) {
                        System.out.print(" ");
                    }
                    // stars
                    for(int col = 0 ; col < row + 1   ; col++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
        
                System.out.println();

                   // star pattern


                   for(int row = 0 ; row < stars  ; row++) {
                    // gaps
                    for(int col = 0 ; col < row  ; col++) {
                        System.out.print(" ");
                    }
                    // stars
                    for(int col = 0 ; col < stars - row ; col++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }


    }



}