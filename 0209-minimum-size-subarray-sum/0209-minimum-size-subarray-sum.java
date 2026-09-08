class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        int i=0,j=0;
        int sum=0;
        while(j<n){
            if(sum<target){
                sum+=nums[j];
                j++;
            }
            else{
                sum-=nums[i];
                min=Math.min(min,j-i);
                i++;
            }
        }
         while (sum >= target) {
            min = Math.min(min, j - i);
            sum -= nums[i];
            i++;
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}