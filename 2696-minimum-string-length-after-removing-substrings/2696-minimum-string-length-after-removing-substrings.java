class Solution {
    public int minLength(String s) {
       if(!s.contains("AB") && !s.contains("CD")) return s.length();
       StringBuilder sb=new StringBuilder();
       for(char ch:s.toCharArray()){
        int len=sb.length();
        if(len>0){
            char last=sb.charAt(len-1);
            if((last=='C' && ch=='D') || (last=='A' && ch=='B')){
                sb.deleteCharAt(len-1);
                continue;
            }
        }
           sb.append(ch);
       }
       return sb.length();
    }
}