class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder str1 = new StringBuilder(s);
        StringBuilder str2 = new StringBuilder(t);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                for (int j = 1; j <= i; j++) {
                    if ((str1.toString()).charAt(i - j) != '#') {
                        str1.setCharAt(i - j, '#');
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                for (int j = 1; j <= i; j++) {
                    if ((str2.toString()).charAt(i - j) != '#') {
                        str2.setCharAt(i - j, '#');
                        break;
                    }
                }
            }
        }
        String str1F = (str1.toString()).replace("#", "");
        String str2F = (str2.toString()).replace("#", "");
        if (str1F.equals(str2F)) {
            return true;
        }
        return false;
    }
}