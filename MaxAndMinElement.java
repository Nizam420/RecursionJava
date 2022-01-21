package Recursion;

public class MaxAndMinElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 8, 9};
        int ans = getMin(arr, 0, arr.length-1);
        int ans1 = getMax(arr, 0, arr.length-1);
        System.out.println(ans);
        System.out.println(ans1);
    }
    static int getMin(int[] arr, int i, int n) {
        if (n == 1) {
            return arr[i];
        }
        return Math.min (arr[i], getMin(arr, i+1, n-1));
    }

    static int getMax(int[] arr, int i, int n) {
        if (n == 1) {
            return arr[i];
        }
        return Math.max (arr[i], getMax(arr, i+1, n-1));
    }
}
