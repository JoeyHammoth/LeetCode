class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        boolean same = true;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length()) {
                    same = false;
                    break;
                }
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    same = false;
                    break;
                }
            }
            if (!same) {
                break;
            }
            result += strs[0].charAt(i);
        }
        return result;
    }
}