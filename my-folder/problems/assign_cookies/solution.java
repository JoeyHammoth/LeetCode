class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : s) {
            list.add(Integer.valueOf(i));
        }
        for (int j : g) {
            for (int k : list) {
                if (j <= k) {
                    result++;
                    list.remove(Integer.valueOf(k));
                    break;
                }
            }
        }
        return result;
    }
}