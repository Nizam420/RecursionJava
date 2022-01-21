package Recursion;

public class Sumofdigit {
    public static void main(String[] args) {
        int n = 12345;
        int res = sumOfDigit(n);
        System.out.println(res);
    }
    static int sumOfDigit(int n){
        if (n == 0) {
            return 0;
        }
        return (n % 10 + sumOfDigit(n / 10));
    }
}
