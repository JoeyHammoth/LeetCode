class NumArray {
    // prefix sum solution which precalculates the sum. Only has to go through array once
    // declare prefix array field
    int[] prefix;
    public NumArray(int[] nums) {
        // initialize prefix sum array with nums length + 1
        prefix = new int[nums.length + 1];
        // iterate over nums array
        for(int i = 0; i < nums.length; i++) {
            // calculate prefix sum on each iteration
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        // return difference between right and left prefix sum
        return prefix[right + 1] - prefix[left];
    }

    // Shitty solution.
    /* public int[] numbers;

    public NumArray(int[] nums) {
        numbers = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numbers[i] = nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            result += numbers[i];
        }
        return result;
    }
    */
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */