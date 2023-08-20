import java.lang.Math;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> exist = new HashSet<>();
        exist.add(n);
        String temp;
        int[] check;
        int result = n;
        while (result != 1) {
            temp = Integer.toString(result);
            check = new int[temp.length()];
            for (int i = 0; i < temp.length(); i++) {
                check[i] = temp.charAt(i) - '0';
            }
            result = 0;
            for (int j : check) {
                result += Math.pow(j, 2);
            }
            if (exist.contains(result)) {
                return false;
            }
            exist.add(result);
        }
        return true;
    }
}