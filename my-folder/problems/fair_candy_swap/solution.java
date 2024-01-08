class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        // Create result arr
        int[] result = new int[2];

        // Compute total candies for alice and bob
        int bobTotal = 0;
        int aliceTotal = 0;
        for (int i : aliceSizes) {
            aliceTotal += i;
        }
        for (int i : bobSizes) {
            bobTotal += i;
        }

        // Put bob's unique candy sizes in its own set
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : bobSizes) {
            set.add(i);
        }

        // Calculate the difference between bob and alice total and the size needed 
        // if alice gives bob a certain size and the size bob needs to give back 
        // in order for both to have in total the same size of candies.

        int delta = (aliceTotal - bobTotal) / 2;

        // The size that is chosen to be candy that alice gives to bob must result in
        // there being a candy size that bob have that is the candy size that alice gives
        // him minus the delta. This results in both people having the same size candies
        // in the end. 

        for (int i : aliceSizes) {
            if (set.contains(Integer.valueOf(i - delta))) {
                result[0] = i;
                result[1] = i - delta;
            }
        }

        return result;
    }
}