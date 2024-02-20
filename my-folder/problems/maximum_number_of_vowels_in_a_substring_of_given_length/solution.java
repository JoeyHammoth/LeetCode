class Solution {
    public int maxVowels(String s, int k) {
        int vowel_num = 0;
        int max_vowel = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < k; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                vowel_num++;
            }
        }
        max_vowel = vowel_num;
        int pointer = 0;
        for (int j = k; j < arr.length; j++) {
            if (arr[pointer] == 'a' || arr[pointer] == 'e' || arr[pointer] == 'i' || arr[pointer] == 'o' || arr[pointer] == 'u') {
                vowel_num--;;
            }
            if (arr[j] == 'a' || arr[j] == 'e' || arr[j] == 'i' || arr[j] == 'o' || arr[j] == 'u') {
                vowel_num++;
            }
            if (vowel_num > max_vowel) {
                max_vowel = vowel_num;
            }
            pointer++;
        }
        return max_vowel;
    }
}