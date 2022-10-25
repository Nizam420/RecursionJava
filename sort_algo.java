public class sort_algo {
    public static void main(String[] args) {
        int[] arr = {1,3,2,7,5,90,14,17,4};
        System.out.print("The Previous Array is:");
        for(int i = 0; i<arr.length; i++)
        {
            
            System.out.print(arr[i]+",");
        }
        // bubble(arr);
        // selection(arr);
        
        // insertion(arr);
        // quick(arr, 0, arr.length-1);
        mergesort(arr, 0, arr.length-1);

        System.out.println();
        System.out.print("The New Array is     :");
        for(int i = 0; i<arr.length; i++)
        {
            
            System.out.print(arr[i]+",");
        }
    }
    public static int[] bubble(int[] a)
    {
        for(int i = 0; i<a.length; i++)
        {
            for(int j = 0; j<a.length-i-1; j++)
            {
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }

    public static int[] selection(int[] a)
    {
        for(int i = 0; i<a.length-1; i++)
        {
            int min = i;
            for(int j = i+1; j<a.length; j++)
            {
                if(a[min]>a[j])
                {
                    min = j;
                }
            }
            if(min!=i)
            {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
        
        return a;
    }

    public static int[] insertion(int[] a)
    {
        for(int i = 1; i<a.length; i++)
        {
            int temp = a[i];
            int j = i-1;
            while(j>=0 && a[j]>temp)
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
        
        return a;
    }
    public static int[] quick(int[] a,int l,int h)
    {
        if(l<h)
        {
            int pivot = partition(a, l, h);
            quick(a, l, pivot-1);
            quick(a, pivot+1, h);
        }

        return a;
    }

    public static int partition(int[] a, int l, int h)
    {
        int pivot = a[l];
        int i = l;
        int j = h;
        while(i<j){
        while(a[i]<=pivot)
            i++;
        while(a[j]>pivot)
            j--;
        if(i<j)
            swap(a, i, j);
        }
        swap(a,j,l);
        return j;
    }

    static int[] mergesort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergesort(arr, low, mid);
            mergesort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
        return arr;
    }

static void merge(int[] arr, int low, int mid, int high) {
        int[] ans = new int[arr.length];
        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                ans[k] = arr[i];
                i++;
            } else {
                ans[k] = arr[j];
                j++;
            }
            k++;
        }
        if (i > mid) {
            while (j <= high) {
                ans[k] = arr[j];
                k++;
                j++;
            }
        } else {
            while (i <= mid) {
                ans[k] = arr[i];
                k++;
                i++;
            }
        }
        for (k = low; k <= high; k++) {
            arr[k] = ans[k];
        }
    }

    public static void swap(int[] a, int p1, int p2){
        int temp = a[p1];
        a[p1] = a[p2];
        a[p2] = temp;
    }

}
