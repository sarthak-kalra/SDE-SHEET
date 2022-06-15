class Solution {
    public int maxProfit(int[] arr) {
        
       int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]-min>profit){
                profit = arr[i]-min;
            }
        }
        return profit;
    }
}