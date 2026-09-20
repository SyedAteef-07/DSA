class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int j=0; int count=s1.length();
        for (int i = 0; i <s2.length(); i++) {
            char c=s2.charAt(i);
            int val=map.getOrDefault(c,0);
            if(val>0) count--;
            map.put(c,val-1);

            if(count==0) return true;

            if(i-j+1==s1.length()){
                char w=s2.charAt(j);
                int left=map.get(w);
                if(left>=0) count++;
                map.put(w,left+1);
                j++;
            }
        }

        return false;
    }
}