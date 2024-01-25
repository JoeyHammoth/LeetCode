class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        List<String> list = new ArrayList<>();
        for (String str : arr) {
            if (!str.equals("")) {
                list.add(str);
            }
        }
        Collections.reverse(list);
        System.out.println(list);
        String result = String.join(" ", list);
        return result;
    }
}