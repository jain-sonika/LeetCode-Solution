class Solution {
    public int findMin(int[] arr) {
        
        int lo =0;
        int hi = arr.length-1;
     
        
        if(arr[0]<=arr[hi]){
            return arr[0];
        }
        while(lo<=hi){
            int mid =(lo+hi)/2;
            if(arr[mid]> arr[mid+1]){
                return arr[mid+1];
            }
            else if(arr[mid] <arr[mid-1]){
                return arr[mid];
            }
            else if(arr[lo]<=arr[mid]){
                lo = mid+1;
            }
            else if(arr[mid]<= arr[hi]){
                hi = mid-1;
            }
        }
        return -1;
    }
}