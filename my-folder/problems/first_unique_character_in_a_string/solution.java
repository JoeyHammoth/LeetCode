class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        for (char v : hm.keySet()) {
            System.out.println(v);
            System.out.println(hm.get(v));
            if (hm.get(v) == 1) {
                return s.indexOf(v);
            }
        }
        return -1;
    }
}