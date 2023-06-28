/*import java.util.*;
public class loops{
    public static void main(String agrs[]){
        int counter =0;
        while(counter <=100){
            System.out.println("Hello World");
            counter++;
        }
        System.out.println("Printed HW 100x");

    }
}
 */

/*import java.util.*;
public class loops{
    public static void main(String agrs[]){
        int number =0;
        while(number <=10){
            System.out.println(number);
            number++;
        }
        System.out.println("Printed Nos till 10");

    }
} */

/*import java.util.*;
public class loops{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int number =1;
        int n = sc.nextInt();
        while(number <= n ){
            System.out.println(number);
            number++;
        }
        System.out.println("");

    }
}
 */

/* import java.util.*;
 public class loops{
     public static void main(String agrs[]){
         Scanner sc = new Scanner(System.in);
         int i =1;
         int sum =0;
         int n = sc.nextInt();
         while(i <= n ){
            sum += i;
            i++;
         }
         System.out.println("Sum of n:" + sum);
 
     }
 } */
 
/* import java.util.*;
 public class loops{
     public static void main(String agrs[]){
         Scanner sc = new Scanner(System.in);
         
        // for (int i=1; i<=10; i++)
        for (int i=1; i<=4; i++)
        {
         System.out.println("****");
         }
     }
 } */

/* import java.util.*;
 public class loops{
     public static void main(String agrs[]){
         Scanner sc = new Scanner(System.in);
        int n = 99081;
        while(n>0){
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n /= 10;//n = n/10

        }
     }
 } */

/* import java.util.*;
 public class loops{
     public static void main(String agrs[]){
         Scanner sc = new Scanner(System.in);
        int n = 99081;
        int rev =0;
        while(n>0){
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n /= 10;

        }
        System.out.print(rev);
     }
 } */

 //do while

/* import java.util.*;
 public class loops{
    public static void main(String agrs[]){
        int n = 1;
        do{
            System.out.println("Hello World");
            n++;
        } while(n <= 10);

    }
 } */

 //break

 /*import java.util.*;
 public class loops{
    public static void main(String agrs[]){
        for(int i = 1; i<=5; i++){
            if( i ==3){
                break;
            }
            System.out.println(i);
        }
        
        System.out.println("I'm out of the loop");


    }
 } */

 //break keyword
/* import java.util.*;
 public class loops{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter number: ");
            int i = sc.nextInt();
            if ( i % 10==0){
                break;
            }
        }while(true);
    }
 } */

 //continue
/* import java.util.*;

import javax.swing.plaf.synth.SynthSplitPaneUI;
 public class loops{
    public static void main(String agrs[]){
        for ( int n=0; n <=5; n++){
            if(n==3){
                continue;
            }
            System.out.print(n);
        }
    }
 } */

 //countinue keyword  Qs
/* import java.util.*;
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
  } */


  //prime or not
  import java.io.InputStreamReader;
import java.util.*;
  public class loops{
       public static void main(String agrs[]){
          Scanner sc = new Scanner(System.in);
          
            System.out.println("Enter your number: ");
            int n = sc.nextInt();
  
              if( n ==2){
                  System.out.println("Given number is a prime no.");
              }
              else{
                boolean isPrime = true;
                for(int i =2; i<=Math.sqrt(n);i++){
                    if(n % i == 0){// n is multiple of i where i is not equal to 1or n
                        isPrime = false;
                    }
                }
                if(isPrime == true){
                    System.out.println("Gievn number is a prime no");
                }else{
                    System.out.println("Gievn number is not a prime no");
                }
               
          }
  
       }
    }