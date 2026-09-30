class Solution {
    public int[] nextGreaterElements(int[] nums) {
      int n=nums.length;
      int []ans=new int[n];
      Stack<Integer> s=new Stack<>();
      Arrays.fill(ans,-1);
      for(int i=2*n-1;i>=0;i--){
        int num=nums[i%n];
        while(!s.isEmpty() && num>=s.peek()){
            s.pop();
        }
        if(!s.isEmpty() && i<n){
            ans[i]=s.peek();
        }
        s.push(num);
      }  
      return ans; 
    }
}