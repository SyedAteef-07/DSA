class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int start=0;
        int end=0;
        int count=0;
        for(int i=0;i<n;i++){
            count+=ispolindrom(s,i,i);
            count+=ispolindrom(s,i,i+1);
        }
        return count;
    }
    private int ispolindrom(String s,int i,int j){
        int count=0;
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            count++;
            i--;
            j++;
        }
        return count;
    }
}