class Solution {
    public String decodeString(String s) {
       Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c!=']'){
                stack.push(c);
            }
            else{
                StringBuilder sb=new StringBuilder();
                while(stack.peek()!='['){
                    sb.insert(0,stack.pop());
                }
                stack.pop();
                StringBuilder sbt=new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    sbt.insert(0,stack.pop());
                }
                int repeat=Integer.parseInt(sbt.toString());
                StringBuilder rep=new StringBuilder();
                for(int i=0;i<repeat;i++){
                    rep.append(sb);
                }
                for(char ch:rep.toString().toCharArray()){
                    stack.push(ch);
                }
            }
        }
        StringBuilder result=new StringBuilder();
        while(!stack.isEmpty()){
            result.insert(0,stack.pop());
        }
        return result.toString();
    }
}