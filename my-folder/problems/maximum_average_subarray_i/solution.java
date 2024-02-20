class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double window_sum = 0.0;
        double max_ave = 0.0;
        for (int j = 0; j < k; j++) {
            window_sum += nums[j];
        }
        max_ave = window_sum / k;
        int pointer = 0;
        for (int i = k; i < nums.length; i++) {
            window_sum -= nums[pointer];
            window_sum += nums[i];
            if (max_ave < window_sum / k) {
                max_ave = window_sum / k;
            }
            pointer++;
        }
        return max_ave;
    }
}