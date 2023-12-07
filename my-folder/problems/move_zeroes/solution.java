class Solution {
    public void moveZeroes(int[] nums) {

        // special case when there is only 1 element
        if (nums.length == 1) {
            return;
        }

        // 1st pointer pointing to curr non-zero index
        int nonZeroIndex = 0;

        // iterate through the nums arr and placing all nonzero nums to the front 
        // using the nonZeroIndex
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        // Rest of the spaces after the nonzero nums will be replaced with zeroes
         while(nonZeroIndex<nums.length){
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }

        // O(n) time complexity since iterate through arr once
        // O(1) space complexity since only given arr is used

    }

    // Shitty solution with O(n^3) since we're iterating through the array thrice
    /*
    public void moveZeroes(int[] nums) {
        int zeroNums = 0;

        for (int i : nums) {
            if (i == 0) {
                zeroNums++;
            }
        }

        for (int i = 0; i < zeroNums; i++) {
            if (nums.length == 1) {
                break;
            }
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == 0) {
                    for (int k = j+1; k < nums.length; k++) {
                        nums[k-1] = nums[k];
                    }
                    nums[nums.length-1] = 0;
                    break;
                }
            }
        }

    }
    */
}