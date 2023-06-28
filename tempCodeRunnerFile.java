import java.util.*;
public class loops{
     public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter your number: ");
            int n = sc.nextInt();

            if( n % 10 ==0){
                continue;
            }
            System.out.println("Your entered number is: "+ n);

        }while(true);

     }
  }