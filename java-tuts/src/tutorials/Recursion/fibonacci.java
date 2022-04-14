package tutorials.Recursion;

import java.util.*;

public class fibonacci {
    public static void main(String[] args){
        double res = fib(3);
        System.out.println("The result is " + res);
    }

    public static double fib(int n){
        if (n == 0){
            return 0;
        } else if (n <= 2){
            return 1;
        } else {
            System.out.format("fib(%d - 1) + fib(%d - 2)\n", n, n);
            return fib(n - 1) + fib(n - 2);
        }
    }                     
}
