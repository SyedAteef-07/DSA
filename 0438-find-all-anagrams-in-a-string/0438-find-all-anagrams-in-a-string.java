class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        if(s.length() < p.length()) return ans;
        Map<Character,Integer> pmap=new HashMap<>();
        Map<Character,Integer> smap=new HashMap<>();
        for(char c:p.toCharArray()){
            pmap.put(c,pmap.getOrDefault(c,0)+1);
        }
        int i=0; int count=p.length();
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            smap.put(c,smap.getOrDefault(c,0)+1);
            if(pmap.containsKey(c) && smap.get(c)<=pmap.get(c)){
                count--;
            }
            if(j-i+1>p.length()){
                char l=s.charAt(i);
                if(pmap.containsKey(l) && smap.get(l)<=pmap.get(l)){
                    count++;
                }
                smap.put(l,smap.get(l)-1);
                i++;
            }
            if(count==0){
                ans.add(i);
            }

        }
        return ans;
    }
}