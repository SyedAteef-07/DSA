class Solution {
    public int pivotInteger(int n) {
        int total=(n*(n+1))/2;
        int prefix[]=new int[n+1];
        prefix[0]=0;
        for(int i=1;i<=n;i++){
            prefix[i]=prefix[i-1]+i;
            if(prefix[i]==total-prefix[i]+i) return i;
        }
         return -1;
    }
}