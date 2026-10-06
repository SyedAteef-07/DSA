class Solution {
    public int minAddToMakeValid(String s) {
       int close=0;
       Stack<Character> stack=new Stack<>();
       for(char c:s.toCharArray()){
        if(c=='(') stack.push(c);
        else{
            if(!stack.isEmpty()){
                stack.pop();
            }
            else{
                close++;
            }
        }
       }
       return close+stack.size();
    }
}