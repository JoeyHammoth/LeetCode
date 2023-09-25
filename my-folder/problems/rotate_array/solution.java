class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = Arrays.copyOf(nums, nums.length);
        for (int i = 0; i < nums.length; i++) {
            int j = i + k;
            while (j >= nums.length) {
                j -= nums.length;
            }
            nums[j] = temp[i];
        }
    }
}