class Solution {
    public boolean backspaceCompare(String s, String t) {
       return build(s).equals(build(t)); 
    }
    private String build(String str){
     Stack<Character> st=new Stack<>();
     for(char c:str.toCharArray()){
        if(c=='#'){
            if(!st.isEmpty()){
                st.pop();
            }
        }
        else{
            st.push(c);
        }
     }  
     StringBuilder ans=new StringBuilder();
     while(!st.isEmpty()){
        ans.insert(0,st.pop());
     }
     return ans.toString();
    }
}