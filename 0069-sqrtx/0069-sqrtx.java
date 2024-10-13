class Solution {
    public int mySqrt(int x) {
        final int SQRT_INT_MAX = 46340;
        int left = 0, right = SQRT_INT_MAX+1;
        while (left < right) {
            int mid = (left+right)/2;
            if (mid*mid <= x) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return left-1;
    }
}