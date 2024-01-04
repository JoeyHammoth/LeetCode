class Solution {
    public int distributeCandies(int[] candyType) {
        int max = candyType.length / 2;

        // Using hash set
        /* HashSet<Integer> set = new HashSet<>();
        for (Integer i : candyType) {
            set.add(i);
        }
        int types = set.size(); */

        //Using hash map
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : candyType) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int types = map.size();
        
        if (max < types) {
            return max;
        } else {
            return types;
        }
        
    }
}