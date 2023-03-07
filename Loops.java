import java.util.*;;
public class Loops {
    // public static void main (String args[]){
    //     for(int i = 1 ; i < 101 ; i++){
    //         System.out.println("Hello World \n" + i);
    //     }
    // }

    // while loop

    // public static void main (String args[]){
    //     int i = 0;
    //     while(i < 11){
    //         System.out.println("Hello How Are you " + i);
    //         i = i+ 1;
    //     }
    // }

    // Do while loop 
    // public static void main (String args[]){
    //     int i = 0;
    //     do{
    //         System.out.println("Hello " + i);
    //         i++;
    //     } while (i<11);
    // }

    // Print the sum of firt n number , n will the value provide by user
   

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // int sum = 0;

        // for(int i = 1 ; i <= number; i++){
        //     sum = sum + i;
        //     System.out.println(sum);
        // }



        // Print table of a number given by the user


    

        for(int i = 1 ; i <11 ; i++){
            int table = number * i;
            System.out.println(table);
        }
    }

}
