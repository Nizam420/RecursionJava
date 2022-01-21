package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 4;
        int ans = fact(n);
        System.out.println(ans);
    }
    
    static int fact(int n){
        if (n <= 1){
            return n;
        }
        return n * fact(n-1);
    }
}
