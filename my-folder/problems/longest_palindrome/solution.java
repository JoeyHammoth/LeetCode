class Solution {
    public int longestPalindrome(String s) {
        boolean oddPresent = false;
        int result = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c: s.toCharArray()) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        for (int i : hm.values()) {
            if (i % 2 == 0) {
                result += i;
            } else {
                oddPresent = true;
                result += i - 1;
            }
        }
        return (oddPresent) ? result + 1 : result;
    }
}