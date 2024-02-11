class Solution {
    public boolean isPalindrome(int x) {
        int sum =0 ;
        int ans =x;
        while(x>0){
            int temp = x%10;
            sum = sum*10 +temp;
            x = x/10;
        }
        return sum == ans;
    }
}