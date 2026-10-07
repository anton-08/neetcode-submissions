class Solution {
    public int maxArea(int[] heights) {
        int result = 0;
        int i = 0;
        int j = heights.length - 1;
        while (i != j) {
            int dist = j - i;
            int temp = 0;
            if (heights[i] < heights[j]) {
                temp = heights[i] * dist;
                if (temp > result) {
                    result = temp;
                }
                i++;
            } else if (heights[i] > heights[j] || heights[i] == heights[j]) {
                temp = heights[j] * dist;
                if (temp > result) {
                    result = temp;
                }
                j--;
            }
        }
        return result;
    }
}
