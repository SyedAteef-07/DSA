class Solution {
    public String minWindow(String s, String t) {
        int m=s.length();
        int n=t.length();
        if(n>m) return "";
        int min=Integer.MAX_VALUE;
        Map<Character,Integer> tmap=new HashMap<>();
        Map<Character,Integer> smap=new HashMap<>();

        for(int i=0;i<n;i++){
            char c=t.charAt(i);
            tmap.put(c,tmap.getOrDefault(c,0)+1);
        }
        int left=0; int count=n;

        String ans="";
        for(int right=0;right < m;right++){
            char c=s.charAt(right);
            smap.put(c,smap.getOrDefault(c,0)+1);
            if(tmap.containsKey(c) && smap.get(c)<=tmap.get(c)){
                count--;
            }
            while(count==0){
                if(right-left+1<min){
                    min=right-left+1;
                    ans=s.substring(left,right+1);
                }
                char l=s.charAt(left);
                smap.put(l,smap.get(l)-1);
                if(tmap.containsKey(l) && smap.get(l)<tmap.get(l)) count++;
                left++;
            }

            } 
        return ans;
    }
}