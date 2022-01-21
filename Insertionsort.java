package Recursion;

import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = {6, 4, 2, 3, 1};
        insertion(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr, int n){
        if (n <= 1){
            return;
        }
        insertion(arr, n - 1);
        int last = arr[n - 1];
        int j = n - 2;
        while (j >= 0 && arr[j] > last){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
}
