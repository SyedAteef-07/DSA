class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[] heights = new int[col];
        int maxarea = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == '1') {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }

            maxarea = Math.max(maxarea, large(heights));
        }

        return maxarea;
    }

    private int large(int[] heights) {
        int n = heights.length;
        int maxarea = 0;

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i <= n; i++) {
            int h = (i == n) ? 0 : heights[i];

            while (!s.isEmpty() && h < heights[s.peek()]) {
                int height = heights[s.pop()];
                int width = s.isEmpty() ? i : i - s.peek() - 1;

                maxarea = Math.max(maxarea, height * width);
            }

            s.push(i);
        }

        return maxarea;
    }
}