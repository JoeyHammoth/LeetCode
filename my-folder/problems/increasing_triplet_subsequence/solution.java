class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i <= min1) { // i < min1
                min1 = i;
            } else if (i < min2) { // i > min1 and i < min2, min2 > i > min1
                min2 = i;
            } else if (i > min2) { // i > min2 > min1
                return true;
            }
        }
        return false;
    }
}