class Solution {
    public String reverseOnlyLetters(String s) {
        List<Character> list = new ArrayList<>();
        char[] arr = new char[s.length()];
        char[] str = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isAlphabetic(str[i])) {
                arr[i] = str[i];
            } else {
                list.add(str[i]);
            }
        }
        Collections.reverse(list);
        for (int i = 0; i < s.length(); i++) {
            if (arr[i] == 0) {
                arr[i] = list.get(0);
                list.remove(0);
            }
        }
        String result = String.valueOf(arr);
        return result;
    }
}