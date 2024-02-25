class Solution {
    public int longestSubarray(int[] nums) {
        // Number of zero's in the window.
        int zeroCount = 0;
        int longestWindow = 0;
        // Left end of the window.
        int start = 0;
        
        for (int i = 0; i < nums.length; i++) {
            zeroCount += (nums[i] == 0 ? 1 : 0);
                          
            // Shrink the window until the zero counts come under the limit.
            while (zeroCount > 1) {
                zeroCount -= (nums[start] == 0 ? 1 : 0);
                start++;
            }
              
            longestWindow = Math.max(longestWindow, i - start);
        }

        return longestWindow;
        /* int i;
        int j = 0;
        int max_window = 0;
        boolean containsZero = false;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && !containsZero) {
                containsZero = true;
            } else if (nums[i] == 0 && containsZero) {
                while (nums[j] != 0) {
                    j++;
                }
                j++;
            }

            if (max_window < i - j) {
                max_window = i - j;
            }
        }
        return max_window - 1; */
    }
}