class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int ans[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int sum=0;
                for(int l=i-k;l<=i+k;l++){
                    for(int r=j-k;r<=j+k;r++){
                        if(l>=0 && l<m && r>=0 && r<n){
                            sum+=mat[l][r];
                        }
                    }
                }
                ans[i][j]=sum;
            }
        }
        return ans;
    }
}