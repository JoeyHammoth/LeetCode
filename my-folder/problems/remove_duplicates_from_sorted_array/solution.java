class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int k = 0;
        for (int i : nums) {
            if (!list.contains(i)) {
                list.add(i);
                k++;
            }
        }
        for (int j = 0; j < k; j++) {
            nums[j] = list.get(j);
        }
        return k;
    }
}