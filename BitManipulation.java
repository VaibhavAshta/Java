import java.util.*;
public class BitManipulation {
    public static void oddOrEven(int n){
        int bitmask = 1;
        if( (n & bitmask) == 1){
            System.out.println("Number is Odd");
        }else{
            System.out.println("Number is Even");
        }
    }

    public static int getIthBit(int n, int i){
        int bitmask = 1<<i;
        if( (n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitmask = 1<<i;    
        return n | bitmask ;
    }

    public static int clearIBit(int n, int i){
        int bitmask = ~(0)<<i;    
        return n & bitmask ;
    }

    public static int updateIthBit(int n, int i, int newBit){
        // if(n == 0){
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }
        
        n = clearIthBit(n, i);
        int bitmask = newBit<<i;    
        return n | bitmask ;
    }

    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);    
        return n & bitmask ;
    }
    

    public static int clearBitsinRange(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a|b;    
        return n & bitmask ;
    }

    public static boolean isPowerOfTwo(int n) {
        return (n&(n-1)) == 0;
    }

    public static int countSetBits(int n) {
        int counter = 0;
        while(n>0){
            if((n&1)!=0){
                counter++;
            }
            n = n>>1; 
        }
        return counter;
    }
        public static int fastExpo(int a, int n){
            int ans = 1;
            while(n > 0){
                if((n & 1) != 0){//check LSB
                    ans = ans * a;
                }
                a = a*a;
                n = n>>1;
            }
            return ans;
        }

    public static void swapWithoutTemp(int a, int b){
        System.out.println("a = "+a+" b = "+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = "+a+" b = "+b);
    }
    public static void main(String[] args) {
        System.out.println(swapWithoutTemp(2, 5));
        swapWithoutTemp(2, 5);

        Convert uppercase character to lowercase
        for(char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char)(ch | ' '));
        }
        prints abcdefghijklmnopqrstuvwxyz

        int x = 6;
        System.out.println(x + " + " + 1 + " is " + -~x); // Prints: 6 + 1 is 7
        
        x = -4;
        System.out.println(x + " + " + 1 + " is " + -~x); // Prints: -4 + 1 is -3
        
        x = 0;
        System.out.println(x + " + " + 1 + " is " + -~x); // Prints: 0 + 1 is 1

    }
}
