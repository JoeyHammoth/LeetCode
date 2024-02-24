class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j;
        for (j = 0; j < nums.length; ++j) {
            if (nums[j] == 0) {
                k--;
            }
            if (k < 0 && nums[i++] == 0) {
                k++;
                System.out.println(i);
            }
        }
        return j - i;
        
        /* int num_ones = 0;
        int reserve = k;
        int max_ones = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                num_ones++;
            } else {
                reserve -= 1;
                num_ones++;
            }

            if (reserve < 1) {
                if (num_ones > max_ones) {
                    max_ones = num_ones;
                }
                num_ones = 0;
                reserve = k; 
            }
        }
        return max_ones; */
    }
}