class Solution {
    public boolean detectCapitalUse(String word) {
        boolean capFirstLetter = false;
        int numCaps = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i)) && i == 0) {
                capFirstLetter = true;
                numCaps++;
            }
            if (Character.isUpperCase(word.charAt(i)) && i != 0) {
                if (capFirstLetter) {
                    numCaps++;
                } else {
                    return false;
                }
            }
        }
        if (numCaps == 0 || numCaps == word.length()) {
            return true;
        } 
        if (numCaps == 1 && capFirstLetter) {
            return true;
        }
        return false;
    }
}