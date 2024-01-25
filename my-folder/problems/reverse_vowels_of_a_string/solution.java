class Solution {
    public String reverseVowels(String s) {
        List<Character> list = new ArrayList<>();
        List<Character> rev = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (list.contains(str[i])) {
                rev.add(str[i]);
                str[i] = 0;
            }
        }
        Collections.reverse(rev);
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 0) {
                str[i] = rev.get(count);
                count++;
            }
        }
        String result = String.valueOf(str);
        return result;
    }
}