class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
       int low=1;
       int high=10000000;
       int ans=-1;
       while(low<=high){
        int mid=low+(high-low)/2;
        if(possible(dist,hour,mid)){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
       }
        return ans;
    }
    private boolean possible(int dist[],double hour,double speed){
        double curhour=0;
        for(int i=0;i< dist.length-1;i++){
            curhour+=Math.ceil((double)dist[i]/speed);
        }
        curhour+=(double)dist[dist.length-1]/speed;
        if(curhour<=hour) return true;
        return false;
    }
}