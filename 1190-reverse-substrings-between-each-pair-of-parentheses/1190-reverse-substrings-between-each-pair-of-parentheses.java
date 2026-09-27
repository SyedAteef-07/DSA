class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c!=')'){
                st.push(c);
            }
            else{
                StringBuilder temp=new StringBuilder();
                while(!st.isEmpty() && st.peek() != '('){
                    temp.append(st.pop());
                }
                st.pop();
                for(int i=0;i<temp.length();i++){
                    st.push(temp.charAt(i));
                }
            }
        }
        StringBuilder ans=new StringBuilder();
        for(char c: st){
            ans.append(c);
        }
        return ans.toString();
    }
}