class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> result = new ArrayList<>();
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        List<String> list = new ArrayList<>();
        Collections.addAll(list, str1);
        Collections.addAll(list, str2);
        Map<String, Integer> map = new HashMap<>();
        for (String i : list) {
            Integer j = map.get(i);
            map.put(i, (j == null) ? 1 : j + 1);
        }

        for (Map.Entry<String, Integer> element : map.entrySet()) {
            if (element.getValue() == 1) {
                result.add(element.getKey());
            }
        }

        String[] fin = new String[result.size()];
        
        for (int o = 0; o < result.size(); o++) {
            fin[o] = result.get(o);
        }
        return fin;
    }
}