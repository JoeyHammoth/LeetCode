class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        boolean checking;
        boolean found;
        int currMax = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            checking = false;
            found = false;
            for (int j : nums2) {
                if (i == j) {
                    checking = true;
                    currMax = j;
                }
                if (checking && j > currMax) {
                    list.add(j);
                    found = true;
                    break;
                }
            }
            if (checking && !found) {
                list.add(-1);
            }
        }
        int[] result = list.stream().mapToInt(i -> i).toArray();
        return result;
    }
}