class Solution {
    public int numUniqueEmails(String[] emails) {
        List<String> list = new ArrayList<>();
        int result = 0;
        for (String i : emails) {
            String[] arr = i.split("@", 2);
            String newlocal1 = arr[0].replace(".", "");
            if (newlocal1.indexOf("+") != -1) {
                String newlocal2 = newlocal1.substring(0, newlocal1.indexOf("+"));
                arr[0] = newlocal2;
            } else {
                arr[0] = newlocal1;
            }
            String str = arr[0] + "@" + arr[1];
            if (!list.contains(str)) {
                result++;
            }
            list.add(str);
        }
        return result;
        
    }
}