import java.util.*;

public class functions {

    /*
     * public static void printhelloworld() {
     * System.out.println("Hello World");
     * System.out.println("Hello World");
     * System.out.println("Hello World");
     * // return 3;
     * }
     */
    public static int calSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of a is : " + a);
        System.out.println("value of b is : " + b);
    }

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int binocoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int binocoeff = fact_n / (fact_r * fact_nmr);
        return binocoeff;
    }

    // func using 2nos
    public static int sum(int a, int b) {
        return a + b;
    }

    // func using 3nos.(over loading)
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static float sum2(float a, float b) {
        return a + b;
    }

    public static int sum2(int a, int b) {
        return a + b;
    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // completely diving
                return false;
            }

        }
        return true;

    }

    public static void isPrimeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                // true
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }

    public static void BinToDec(int binNum) {
        int pow = 0;
        int mynum = binNum;
        int decNum = 0;
        while (binNum > 0) {
            int LastDigit = binNum % 10;
            decNum = decNum + (LastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;

        }
        System.out.println("decimal of " + mynum + " = " + decNum);
    }

    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        BinToDec(101);

    }
}
