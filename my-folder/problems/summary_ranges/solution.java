class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> solution = new ArrayList<>();
        boolean newRange = true;
        int initialRange = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                if (nums[i] - 1 != nums[i-1]) {
                    if (nums[i-1] == initialRange) {
                        solution.add(String.valueOf(initialRange));
                    } else {
                        solution.add(initialRange + "->" + nums[i-1]);
                    }
                    newRange = true;
                }
            }

            if (newRange) {
                initialRange = nums[i];
                if (i != nums.length - 1) {
                    newRange = false;
                }
            }

            if (i == nums.length - 1) {
                if (newRange) {
                    solution.add(String.valueOf(initialRange));
                } else {
                    solution.add(initialRange + "->" + nums[i]);
                }
            }
        }

        return solution;
    }
}