class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }
        for (int i = 0; i < words.length; i++) {
            if (i+1 < words.length) {
                for (int j = 0; j < words[i].length(); j++) {
                    if (j + 1 > words[i+1].length()) {
                        return false;
                    }
                    if (words[i].charAt(j) != words[i+1].charAt(j)) {
                        if (map.get(words[i].charAt(j)) > map.get(words[i+1].charAt(j))) {
                            return false;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        return true;
    }
}