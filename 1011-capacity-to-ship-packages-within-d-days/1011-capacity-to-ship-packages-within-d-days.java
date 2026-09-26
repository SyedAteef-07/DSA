class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int i:weights){
            high+=i;
            if(i>low) low=i;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canhave(weights,days,mid)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    private boolean canhave(int weights[],int days,int cap){
        int d=1;int curr=0;
        for(int i:weights){
            curr+=i;
            if(curr>cap){
                d++;
                curr=i;
            }
        }
        return d<=days;
    }

}