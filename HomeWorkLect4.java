import java.util.*;;

public class HomeWorkLect4 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        // Check if a number is even or not , get input from user


        for(int i= 1 ; i <= number ; i++ ){
            if(i % 2 == 0){
                System.out.println(i + " Even Number");
            }
            
        }
    }
}
