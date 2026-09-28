class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0;int high=0;
        for(int n:nums){
            high+=n;
            low=Math.max(low,n);
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(can(nums,k,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    private boolean can(int nums[],int k,int maxsum){
        int count=1;
        int curr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]+curr<=maxsum){
                curr+=nums[i];
            }
            else{
                count++;
                curr=nums[i];
            }
        }
        return count<=k;

    }
}