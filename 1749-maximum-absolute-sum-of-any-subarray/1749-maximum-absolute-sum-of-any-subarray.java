class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n=nums.length;
        int maxpri=0;
        int minpri=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            maxpri=Math.max(maxpri,sum);
            minpri=Math.min(minpri,sum);
        }
        return maxpri-minpri;
    }
}