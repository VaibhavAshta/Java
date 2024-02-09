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
    public static void main(String[] args) {
        System.out.println(countSetBits(16));
    }
}