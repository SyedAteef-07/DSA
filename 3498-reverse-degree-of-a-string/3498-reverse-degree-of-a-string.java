class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int c=Math.abs((s.charAt(i) - 'z'))+1;
            sum+=(i+1)*c;
        }
        return sum;
    }
}