class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int ans[]=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            int num=temperatures[i];
            while(!s.isEmpty() && num>= temperatures[s.peek()]){
                s.pop();
            }
            if(!s.isEmpty()){
                ans[i]=s.peek()-i;
            }
            s.push(i);
        }
        return ans;
    }
}