class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr = new char[word1.length() + word2.length()];
        int word1Pointer = 0;
        int word2Pointer = 0;
        boolean fill1 = false;
        boolean fill2 = false;
        for (int i = 0; i < word1.length() + word2.length(); i++) {
            if (word1Pointer + 1 > word1.length()) {
                fill2 = true;
            }
            if (word2Pointer + 1 > word2.length()) {
                fill1 = true;
            }
            if ((i % 2 == 0 && !fill2) || fill1) {
                arr[i] = word1.charAt(word1Pointer);
                word1Pointer++;
            }
            if ((i % 2 != 0 && !fill1) || fill2) {
                arr[i] = word2.charAt(word2Pointer);
                word2Pointer++;
            }
        }
        String result = String.valueOf(arr);
        return result;
    }
}