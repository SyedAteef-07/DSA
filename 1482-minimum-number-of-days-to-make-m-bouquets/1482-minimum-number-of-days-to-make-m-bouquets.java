class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
       if((long) m*k > bloomDay.length) return -1;
       int low=Integer.MAX_VALUE;
       int high=Integer.MIN_VALUE;;
       int ans=-1;
       for(int i : bloomDay){
         low=Math.min(low,i);
         high=Math.max(high,i);
       } 
       while(low<=high){
        int mid=low+(high-low)/2;
        if(can(bloomDay,m,k,mid)){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
       }
       return ans;
    }
    private boolean can(int bloomDay[],int m,int k,int day){
        int count=0;
        int b=0;
        for(int bloom:bloomDay){
            if(bloom<=day){
                count++;
                if(count==k){
                    b++;
                    count=0;
                }
            }
            else{
                    count=0;
                }
        }
        if(b>=m) return true;
        return false;
    }
}