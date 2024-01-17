import java.util.Scanner;

import java.util.*;

public class Basic {
    public static void main (String args[]) {
        System.out.println("Hello World");

        String name = "ash";
        name = "pri";
        int a = 10;
        int b = 5;
        int total = (a * b) /  (a -b) ;
        System.out.println(total);
        System.out.println(name);
        System.out.println(a);

        // Taking input
        // System.out.println("Enter Your Name");
        // Scanner sc = new Scanner(System.in);
        // String myNamse = sc.next();
        // // nextInt //for taking int as input //similary for other data types
        // // String myName = sc.nextLine();
        // System.out.println("Your name is " + myName);

        for(int i = 1 ; i <= 10 ; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        int i = 1;
        while(i <= 10) {
            System.out.print(i*2 + " ");
            i++;
        }


        int day = 1;
        switch(day) {
            case 1 : 
                System.out.println("Monday");
                break;
            case 2 : System.out.println("Tuesday");
                break;
            case 3 : System.out.println("Wednesday");
                break;
            case 4 : System.out.println("Thursday");
                break;  
            case 5 : System.out.println("Friday");
                break;  
            case 6 : System.out.println("Saturday");
                break;  
            case 7 : System.out.println("Sunday");
                break;   
            default : System.out.println("Invalid Day");               
        }



        Scanner aa = new Scanner(System.in);   //only one scanner is required
        Scanner bb = new Scanner(System.in);
        System.out.println("Enter First Digit");
        int first = aa.nextInt();
        System.out.println("Enter First Digit");
        int second = bb.nextInt();

        int res = first + second;
        System.out.println("The sum of both digits is : " + res);


        // If else
        System.out.println("Enter your age !");
        Scanner numm = new Scanner(System.in);
        int num = numm.nextInt();

        if(num > 18) {
            System.out.println("You are eligible to vote");
        } else if (num == 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }







    }
}


