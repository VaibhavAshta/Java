/*
import java.util.*;
public class Qs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int     a  = sc.nextInt();
        int     b  = sc.nextInt();
        int     c  = sc.nextInt();
        int   avg  = a+b+c/3;
        System.out.println(avg);
    }
}*/

/* 
import java.util.*;
public class Qs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float s = sc.nextFloat();
        float area = s*s;
        System.out.println(area);
    }
}*/

/*//Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser. You have to output the total cost of the items back to the user 
//as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import java.util.*;
public class Qs{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencile= sc.nextFloat();
        float pen    = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total  = pencile + pen + eraser;
        System.out.println("Bill is : "+total);
        float newTotal = total+ (0.18f*total);
        System.out.println("Bill with 18% tax : "+newTotal);
    }
} */

/*import java.util.*;
public class Qs{
    public static void main (String args[]){
        /*double temp = 103.5;
        if(temp > 100){
            System.out.println("You have fever");
        }
        else{
            System.out.println("You don't have fever");
        } */

        /*Scanner sc = new Scanner(System.in);
        int day  = sc.nextInt();
        switch(day){
        case 1: System.out.println("Monday");
        break;
        case 2: System.out.println("Tuesday");
        break;
        case 3: System.out.println("Wednesday");
        break;
        case 4: System.out.println("Thursday");
        break;
        case 5: System.out.println("Friday");
        break;
        case 6: System.out.println("Saturday");
        break;
        case 7: System.out.println("Sunday");
        break;
        default: System.out.print("Wrong input");
        } */
/* 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) !=0;
        boolean z = ((year%100==0) && (year%400==0));

        if (x && (y || z )){
            System.out.println("It's leap year");

        }

        else{
            System.out.println("Not a leap year");
        }

    }
}*/

/*import java.util.*;
public class Qs{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 0){
            System.out.println("1");
        }
        else{
            
        }
    }
} 
 */

/*import java.util.*;
public class Qs{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int oddSum  = 0;
        int evenSum = 0;
        int choice;
        int number;

        do{
            System.out.print("Enter number: ");
            number = sc.nextInt();
            if( number % 2 == 0){
                evenSum += number;
            }
            else{
                oddSum += number;
            }
            System.out.println("Do you want to contiune? Press 1. Yes 2. No");
            choice = sc.nextInt();

        }while(choice==1);

        System.out.println("Sum of even digits is: " + evenSum);
        System.out.println("Sum of odd digits is: " + oddSum);
        

    }
} */

/*import java.util.*;
public class Qs{
    public static void printMultiplicationTable(int number)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enetr any number ");
        int n = sc.nextInt();

        for(int i = 1 ; i<=10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
        public static void main(String s[]){
            printMultiplicationTable(5);
        }
    
} */