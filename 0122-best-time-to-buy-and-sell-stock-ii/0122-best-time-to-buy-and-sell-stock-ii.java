class Solution {
    public int maxProfit(int[] prices) {
        
        
        int profit =0;
        for(int i =1 ; i < prices.length ;  i++){
            if(prices[i] > prices[i-1]){
                profit = profit +(prices[i] - prices[i-1]);
        }
        
        
        
    }
        return profit;
}
}

/*// Brute Force Solution TC: O(n) SC: O(1)
class Solution {
    public int maxProfit(int[] a){
        
        int min = a[0];
        int sum = 0;
        int profit = 0;
        int diff = 0;
        
        for(int i=1; i<a.length; i++){
            if(min > a[i]){
                min = a[i];
            }
            diff = a[i] - min;
            
            if(sum < diff){
                sum = diff;
                min = a[i];
                // profit = profit + diff;
            }
            profit = profit + sum;
            sum=0;
            
        }
        
        return profit;

    }
}*/