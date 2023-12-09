class Solution {
    public int thirdMax(int[] nums) {
        // Sort the array in non-increasing order.
        Arrays.sort(nums);
        
        // Reverse array to make it non-increasing.
        for (int index = 0; index < nums.length / 2; ++index) {
            int temp = nums[index];
            nums[index] = nums[nums.length - 1 - index];
            nums[nums.length - 1 - index] = temp;
        }
        
        int elemCounted = 1;
        int prevElem = nums[0];
        
        for (int index = 1; index < nums.length; ++index) {
            // Current element is different from previous.
            if (nums[index] != prevElem) {
                elemCounted += 1;
                prevElem = nums[index];
            }
            
            // If we have counted 3 numbers then return current number.
            if (elemCounted == 3) {
                return nums[index];
            }
        }
        
        // We never counted 3 distinct numbers, return largest number.
        return nums[0];
    }
    
    // My shitty attempt
    /* public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (i == Integer.MAX_VALUE) {
                set.add(i - 1);
            } else if (i == -Integer.MAX_VALUE) {
                set.add(i + 1);
            } else {
                set.add(i);
            }
        }
        int max;
        if (set.size() < 3) {
            max = set.size();
        } else {
            max = set.size() + 1 - 3;
        }
        int j = 1;
        System.out.println(set);
        for (int i : set) {
            if (j == max) {
                return i;
            }
            j++;
        }
        return 0;
    } */
}