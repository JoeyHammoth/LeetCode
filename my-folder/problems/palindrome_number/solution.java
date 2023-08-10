class Solution {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        String reverse = "";
        char ch;
        for (int i = 0; i < num.length(); i++) {
            ch = num.charAt(i);
            reverse = ch + reverse;
        }
        if (num.equals(reverse)) {
            return true;
        }
        return false;
    }
}