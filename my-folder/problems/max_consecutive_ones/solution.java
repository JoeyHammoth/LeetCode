class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // Set maximum consecutive 1s and current number of consecutive 1s
        int max = 0;
        int curr = 0;

        // Iterate through array
        for (int i : nums) {
            // If i = 1, increase curr count by 1
            if (i == 1) {
                curr++;
            }
            // If i = 0, if curr is bigger than curr max, set max to be curr
            if (i == 0) {
                if (curr > max) {
                    max = curr;
                }
                // reset curr counter since no longer consecutive
                curr = 0;
            }
        }
        // If there is no 0 at the end of arr, if curr is bigger than curr max, 
        // set max to be curr
        if (curr > max) {
            max = curr;
        }
        return max;
    }
}