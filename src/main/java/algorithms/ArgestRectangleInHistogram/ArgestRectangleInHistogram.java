package algorithms.ArgestRectangleInHistogram;

/**
 * @Author : Wu.D.J
 * @Create : 2020.11.03
 * https://leetcode-cn.com/problems/largest-rectangle-in-histogram/
 *
 * https://leetcode-cn.com/problems/largest-rectangle-in-histogram/solution/bao-li-jie-fa-zhan-by-liweiwei1419/
 */
public class ArgestRectangleInHistogram {

    // 1.暴力解法
    // 2.左右夹逼
    public int largestRectangleArea(int[] heights) {
        if (heights.length == 0) return 0;
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int left = i;
            int right = i;
            while (left > 0 && heights[left - 1] >= heights[i]) {
                left--;
            }
            while (right < heights.length - 1 && heights[right + 1] >= heights[i]) {
                right++;
            }
            int height = right - left + 1;
            maxArea = Math.max(maxArea, height * heights[i]);
        }
        return maxArea;
    }
}
