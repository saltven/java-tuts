package tutorials.Recursion;

import java.util.*;

public class factorial {
    public static void main (String[] args){
        double res = fact(7);
        System.out.println("factorial is " + res);
    }

    public static double fact(int n){
        if (n == 1){
            System.out.println("1");
            return 1;
        } else {
            System.out.format("factorial(%d - 1) * %d\n", n, n);
            return fact(n - 1) * n;
        }

    }
}
