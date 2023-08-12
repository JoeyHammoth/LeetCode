class Solution {
    public int strStr(String haystack, String needle) {
        boolean occur;
        int result = -1;
        if (haystack.length() < needle.length()) {
            return result;
        }
        for (int i = 0; i < haystack.length(); i++) {
            occur = true;
            for (int j = 0; j < needle.length(); j++) {
                if (i + j >= haystack.length()) {
                    occur = false;
                    break;
                }
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    occur = false;
                    break;
                }
            }
            if (occur) {
                result = i;
                break;
            }
        }
        return result;
    }
}