class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> hm1 = new HashMap<>();
        Map<Character, Integer> hm2 = new HashMap<>();
        for (char c1 : s.toCharArray()) {
            if (hm1.containsKey(c1)) {
                hm1.put(c1, hm1.get(c1) + 1);
            } else {
                hm1.put(c1, 1);
            }
        }
        for (char c2 : t.toCharArray()) {
            if (hm2.containsKey(c2)) {
                hm2.put(c2, hm2.get(c2) + 1);
            } else {
                hm2.put(c2, 1);
            }
        }
        for (char c3 : hm2.keySet()) {
            if (!hm1.containsKey(c3) || hm2.get(c3) - hm1.get(c3) == 1) {
                return c3;
            }  
        }    
        return 'l';
    }
}