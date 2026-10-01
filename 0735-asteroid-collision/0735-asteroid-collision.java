class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {  
            int curr = asteroids[i];

            if (curr > 0) {
                stack.push(curr);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(curr)) {
                    stack.pop();
                }

                if (!stack.isEmpty() && stack.peek() == Math.abs(curr)) {
                    stack.pop(); 
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(curr); 
                }
            }
        }
        int[] arr = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            arr[i] = stack.pop();
        }
        return arr;
    }
}
