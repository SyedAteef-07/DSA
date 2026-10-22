class Solution {
    public int minOperations(int[] nums) {
        int zero=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero=i;
                break;
            }
        }
        int ans=Integer.MAX_VALUE;
        boolean inc=true;
        for(int i=0;i<n;i++){
            if(nums[(zero+i)%n]!=i){
                inc=false;
                break;
            }
        }
        if(inc){
            ans=Math.min(ans,zero);
            ans=Math.min(ans,n-zero+2);
        }
        boolean dec=true;
        for(int i=0;i<n;i++){
            if(nums[(zero-i+n)%n]!=i){
                dec=false;
                break;
            }
        }
        if(dec){
            ans=Math.min(ans,zero+2);
            ans=Math.min(ans,n-zero);
        }
        return ans==Integer.MAX_VALUE ? -1:ans;
    }
}