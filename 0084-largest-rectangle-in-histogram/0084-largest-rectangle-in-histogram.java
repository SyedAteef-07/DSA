class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxarea=0;
        int n=heights.length;
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<=n;i++){
            int h=(i==n)?0:heights[i];
            while(!s.isEmpty() && h< heights[s.peek()]){
                int height=s.pop();
                int width= s.isEmpty() ? i:i-s.peek()-1;
                
                int area=heights[height]*width;
                maxarea=Math.max(maxarea,area);
            }
            s.push(i);
        }
        return maxarea;
    }
}