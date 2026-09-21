class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        return binary(nums,left,right,target);
    }
    private int binary(int nums[],int left,int right,int target){
        if(left>right){
            return -1;
        }
        int mid=left+(right-left)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[mid]<target){
           return binary(nums,mid+1,right,target);
        }
        return binary(nums,left,mid-1,target);
    }
}