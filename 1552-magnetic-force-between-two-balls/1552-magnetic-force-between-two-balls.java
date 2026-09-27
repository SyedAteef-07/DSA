class Solution {
    public int maxDistance(int[] position, int m) {
       int low=1;int ans=-1;
       Arrays.sort(position);
       int high=position[position.length-1]-position[0];
       while(low<=high){
        int mid=low+(high-low)/2;
        if(can(position,m,mid)){
            ans=mid;
            low=mid+1;
        }
        else{
            high=mid-1;
        }
       } 
       return ans;
    }
    private boolean can(int position[],int m,int gap){
        int count=1;
        int last=position[0];
        for(int i=1;i<position.length;i++){
            if(position[i]-last>=gap){
                count++;
                last=position[i];
            }
            if(count>=m) return true;
        }
        return false;
    }
}