class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums2);
        for (int i : nums1) {
            int res = Arrays.binarySearch(nums2, i);
            if (res >= 0) {
                set.add(i);
            }
        }

        int[] result = new int[set.size()];
        int i = 0;
        for (int j : set) {
            result[i] = j;
            i++;
        }
        return result;
        // Note that hashset does not have a .get method for some fucking reason????
        // O(n) since we are iterating through the nums1 array once.
        // space complexity is O(2n) because of result array and the hashset. 
    }
}