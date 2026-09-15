class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += nums[i];
        }

        int max = nums[0];
        int currMax = nums[0];

        int min = nums[0];
        int currMin = nums[0];

        for (int i = 1; i < n; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            max = Math.max(max, currMax);
            currMin = Math.min(nums[i], currMin + nums[i]);
            min = Math.min(min, currMin);
        }
        if (max < 0) {
            return max;
        }

        return Math.max(max, total - min);
    }
}