// Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
// n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
// Find two lines, which together with x-axis forms a container, such that the container contains the most water.
// Note: You may not slant the container and n is at least 2.

// This question is basically saying what two vertical lines will hold the most water
// The area between two lines is bottlenecked by the smaller vertical line

// use the two pointer method with a pointer at the beginning and end of the array and move towards the middle

public class CollectingWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            maxArea = Math.max(maxaAea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}