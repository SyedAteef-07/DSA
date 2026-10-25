class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1) return 1;
        Map<Character,Integer> ans=new HashMap<>();
        for(char ch:s.toCharArray()){
            ans.put(ch,ans.getOrDefault(ch,0)+1);
        }
        int length=0;
        boolean odd=false;
        for(int freq:ans.values()){
            if(freq%2==0) length+=freq;
            else{
                length+=freq-1;
                odd=true;
            }
        }
        if(odd) length++;
        return length;

    }
}