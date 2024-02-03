class Solution {
    public int compress(char[] chars) {
        List<Character> list = new ArrayList<>();
        int count = 0;
        char letter = '\u0000';
        for (int i = 0; i < chars.length; i++) {
            if (letter == '\u0000') {
                list.add(chars[i]);
                letter = chars[i];
                count++;
            } else if (letter == chars[i]) {
                count++;
            } else {
                if (count != 1) {
                    String str = String.valueOf(count);
                    for (char c : str.toCharArray()) {
                        list.add(c);
                    }
                }
                list.add(chars[i]);
                letter = chars[i];
                count = 1;
            }
        }
        if (count != 1) {
            String str = String.valueOf(count);

            for (char c : str.toCharArray()) {
                list.add(c);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            chars[i] = list.get(i);
        }

        return list.size();
    }
}