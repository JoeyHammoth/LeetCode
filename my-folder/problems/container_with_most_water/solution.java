class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left < right){
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * w;
            max = Math.max(max, area);
            if(height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--;
            else {
                left++;
                right--;
            }
        }
        return max;
    
        // Shitty O(n^2) solution
        /* int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i; j < height.length; j++) {
                int chosenH = (height[i] < height[j]) ? height[i] : height[j];
                int rect = chosenH * (j - i);
                if (rect > max) {
                    max = rect;
                }
            }
        }
        return max; */
    }
}