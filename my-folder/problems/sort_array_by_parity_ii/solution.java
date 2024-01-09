class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                if (nums[i] % 2 != 0) {
                    odd.add(nums[i]);
                } else {
                    result[i] = nums[i];
                }
            } else {
                if (nums[i] % 2 == 0) {
                    even.add(nums[i]);
                } else {
                    result[i] = nums[i];
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (result[i] == -1) {
                if (i % 2 == 0) {
                    result[i] = even.get(0);
                    even.remove(0);
                } else {
                    result[i] = odd.get(0);
                    odd.remove(0);
                }
            }
        }

        return result;
    }
}