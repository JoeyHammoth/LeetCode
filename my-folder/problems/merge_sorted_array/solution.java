class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        } else {
            for (int j = 0; j < n; j++) {
                nums1[m + j] = nums2[j];
            }
        }
        Arrays.sort(nums1);
    }
}