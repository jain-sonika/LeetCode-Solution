class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;

        // Loop to rearrange the array elements based on certain conditions
        while (i < nums.length) {
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1])
                swap(nums, i, nums[i] - 1);
            else
                i++;
        }

        // Check for the first missing positive integer in the rearranged array
        for (i = 0; i < nums.length; i++) {
          //: Checks if the current element is not equal to its expected value (i + 1). If true, it means this is the first missing positive integer, and it returns it.
            if (nums[i] != i + 1)
                return i + 1;
        }

        // If all positive integers from 1 to nums.length are present, return the next positive integer
        return nums.length + 1;
    }

    // Helper method to swap elements at given indices in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
