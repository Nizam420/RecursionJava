class myclass
{
    public int maxProfit(int[] prices) { // T.C---O(n) S.C---O(n)
        int n=prices.length,ans=0;
        int[] arr = new int[n]; // Extra space uses
        arr[n-1] = prices[n-1];
        for(int i=n-2; i>=0; i--){
            arr[i] = Math.max(arr[i+1],prices[i]);
        }
        for(int j=0; j<n; j++){
            ans = Math.max((arr[j]-prices[j]),ans);
        }
        return ans;
    }
}