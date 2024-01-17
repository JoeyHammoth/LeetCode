class Solution {
    public int repeatedNTimes(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            map.put(i, (map.containsKey(i)) ? map.get(i) + 1 : 1);
        }
        for (Map.Entry<Integer, Integer> element : map.entrySet()) {
            if (element.getValue() == nums.length / 2) {
                result = element.getKey();
            }
        }
        return result;
    }
}