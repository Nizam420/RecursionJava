package Recursion;

public class BS {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 8, 9, 12, 23};
        int ans = search(arr, 9, 0, arr.length - 1);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return search(arr, target, s, mid - 1);
        }

        return search(arr, target, mid + 1, e);
    }
}
