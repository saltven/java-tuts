package tutorials.Recursion;

public class sumOfTwoPower {
    public static void main(String[] args){
        int res = totalPowerTwo(5, 10);
        System.out.println("The result is: " + res);
    }

    public static int totalPowerTwo(int m, int n){
        if ( m < n){
            System.out.println("(" + m*m + " + totalPowerTwo("+m+","+n+"))");
            return m*m + totalPowerTwo(m+1, n);
        } else {
            System.out.println("(" + m*m + " + totalPowerTwo("+m+","+n+"))");
            return m*m;
        }
    }
}


