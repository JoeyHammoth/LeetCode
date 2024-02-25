class Solution {
    public int largestAltitude(int[] gain) {
        int currAlt = 0;
        int maxAlt = 0;
        for (int i : gain) {
            currAlt += i;
            if (maxAlt < currAlt) {
                maxAlt = currAlt;
            }
        }
        return maxAlt;
    }
}