class Solution {
    public int pivotIndex(int[] nums) {
       int n=nums.length;
       int sum1=0;
       int totalsum=0;
       for(int x: nums){
        totalsum+=x;
       }
       for(int i=0;i<n;i++){
        int sum2=totalsum-nums[i]-sum1;
        if(sum1==sum2) return i;
        sum1+=nums[i];
       }
       return -1;
    }
}