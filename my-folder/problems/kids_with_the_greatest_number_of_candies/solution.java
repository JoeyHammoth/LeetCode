class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        for (int i : candies) {
            if (checkGreatest(candies, i + extraCandies)) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
        
    }
    public boolean checkGreatest(int[] candies, int value) {
        for (int i : candies) {
            if (value < i) {
                return false;
            }
        }
        return true;
    }
}