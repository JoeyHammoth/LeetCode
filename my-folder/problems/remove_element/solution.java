class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        int k = 0;
        for (int i : nums){
            if (i != val) {
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