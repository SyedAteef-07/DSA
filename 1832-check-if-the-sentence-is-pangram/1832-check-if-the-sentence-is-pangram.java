class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean ans[]=new boolean[26];
        for(int i=0;i<sentence.length();i++){
            char c=sentence.charAt(i);
            ans[c-'a']=true;
        }
        for(boolean c:ans){
            if(!c) return false;
        }
        return true;
    }
}