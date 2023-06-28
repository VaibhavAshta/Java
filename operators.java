/*import java.util.*;
public class operators{
    public static void main(String args[]){
        int A = 25;
        int B = A--;
        System.out.println(A);
        System.out.println(B);
    }
} */

/*public class operators{
    public static void main(String args[]){
        int a = 10;
        int b = 15;
        System.out.println( (a<b));
    }
} */

/*public class operators{
    public static void main(String args[]){
        //System.out.println( (3>2) && (5>4));
        //System.out.println( (3<2) || (5>4) );
        //System.out.println( !(5>4));


        int a = 5;
        //a = a + 5;
        //a+=5;//fater excution
        //a*=5;// a = a*5
        //a/=5;
        a %=5;
        System.out.println(a);
    }
} */

/*public class operators{
    public static void main(String args[]){
        int age =17;
        if (age >=18){
            System.out.println("Adult: vote, driving");
        }
        else{
            System.out.println("Not an adult");
        }
    }
} */

/*public class operators{
    public static void main(String args[]){
        int a = 5;
        int b = 10;
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
} */
/*import java.util.*;
public class operators{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2 == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
} */

/*import java.util.*;
public class operators{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int tax;
        if(a < 500000){
            System.out.println("Tax 0%");
        }
        else if(a >= 500000 && a<1000000){
            System.out.println("Tax 20%" + (int)(a*0.2));

        }
        else{
            System.out.println("Tax 30%" + (int)(a*0.3));
        }
    }
} */

/*import java.util.*;
public class operators{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a >b && a>c){
            System.out.println(a + " is Largest No.");
        }
        else if(b >c){
            System.out.println(b + " is Largest No.");

        }
        else{
            System.out.println(c + " is Largest No.");
        }
    }
} */

/*import java.util.*;
public class operators{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String type = ((a%2) == 0) ?"even":"odd";
        System.out.println(type);
    }
} */

/*import java.util.*;
public class operators{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        String type = (m1>=33) ?"pass":"fail";
        System.out.println(type);
    }
} */

import java.util.*;
public class operators{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        float A = sc.nextFloat();
        System.out.print("Enter value of b: ");
        float B = sc.nextFloat();
        System.out.print("Enter operator: ");
        char operator= sc.next().charAt(0);
        
        switch(operator){
            case '+' : System.out.print(A+B);
            break;
            case '-' : System.out.print(A-B);
            break;
            case '*' : System.out.print(A*B);
            break;
            case '/' : System.out.print(A/B);
            break;
            case '%' : System.out.print(A%B);
            break;
            default: System.out.print("Wrong input");

        }
    }
}