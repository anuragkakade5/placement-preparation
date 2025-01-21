class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

/*Initialization: maxSum = -2, currentSum = -2.
1. Loop:
        i = 1, nums[i] = 1:
        currentSum = Math.max(1, -2 + 1) = 1.
        maxSum = Math.max(-2, 1) = 1.
        i = 2, nums[i] = -3:
        currentSum = Math.max(-3, 1 - 3) = -2.
        maxSum = Math.max(1, -2) = 1.
        i = 3, nums[i] = 4:
        currentSum = Math.max(4, -2 + 4) = 4.
        maxSum = Math.max(1, 4) = 4. *...
        
2.  Return: 
        maxSum = 6, which is the maximum subarray sum 
        found in the entire array. */