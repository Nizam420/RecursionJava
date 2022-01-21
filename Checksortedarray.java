package Recursion;

public class Checksortedarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        if (checkArray(arr, n) != 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    static int checkArray(int[] arr, int n){
        if (n <= 1){
            return 1;
        }
        if (arr[n-1] < arr[n-2]){
            return 0;
        }       
        return checkArray(arr, n - 1);
    }
}
