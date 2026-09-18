class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        int n=s.length();
        int m=p.length();
        int pcount[]=new int[26];
        for(char c:p.toCharArray()){
            pcount[c-'a']++;
        }
        for(int i=0;i<=n-m;i++){
            int scount[]=new int[26];
            for(int j=i;j<i+m;j++){
                scount[s.charAt(j)-'a']++;
            }
            if(Arrays.equals(pcount,scount)){
                ans.add(i);
            }
        }
        return ans;

    }
}