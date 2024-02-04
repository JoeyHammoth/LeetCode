class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int countS = 0;
        int countT = 0;

        if (s.length() > t.length()) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }

        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(countS) == t.charAt(countT)) {
                countS++;
            }
            if (countS == s.length()) {
                return true;
            }
            countT++;
        }
        return false;
        
    }
}