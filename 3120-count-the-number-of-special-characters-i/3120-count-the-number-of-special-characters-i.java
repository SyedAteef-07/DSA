class Solution {
    public int numberOfSpecialChars(String word) {
       boolean uc[]=new boolean[26];
       boolean lc[]=new boolean[26];
       for(char c:word.toCharArray()){
        if(Character.isLowerCase(c)){
            lc[c-'a']=true;
        }
        else{
            uc[c-'A']=true;
        }
       } 
       int count=0;
       for(int i=0;i<26;i++){
        if(lc[i] && uc[i]){
            count++;
        }
       }
       return count;
    }
}