class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        } else if (ransomNote.equals(magazine)) {
            return true;
        }
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            if (i < ransomNote.length()) {
                if (hm1.containsKey(ransomNote.charAt(i))) {
                    hm1.put(ransomNote.charAt(i), hm1.get(ransomNote.charAt(i)) + 1);
                } else {
                    hm1.put(ransomNote.charAt(i), 1);
                }
            }
            if (hm2.containsKey(magazine.charAt(i))) {
                hm2.put(magazine.charAt(i), hm2.get(magazine.charAt(i)) + 1);
            } else {
                hm2.put(magazine.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : hm1.entrySet()) {
            if (hm2.containsKey(entry.getKey())) {
                if (hm2.get(entry.getKey()) < entry.getValue()) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}