class Solution {
    public int findJudge(int n, int[][] trust) {
        if (trust.length == 0 && n == 1) 
            return 1;
        int[] count = new int[n + 1];
        for (int[] person : trust) {
            count[person[0]]--;
            count[person[1]]++;
        }

        for (int person = 0; person < count.length; person++) {
            if (count[person] == n - 1) return person;
        }
        return -1;
        /* List<Integer> set = new ArrayList<>();
        List<Integer> set2 = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            set.add(i);
            set2.add(i);
        }
        for (int[] arr : trust) {
            if (set.contains(arr[0])) {
                set.remove(Integer.valueOf(arr[0]));
            }
        }
        if (set.size() == 0) {
            return -1;
        } else {
            set2.remove(set.get(0));
            for (int[] arr : trust) {
                if (Integer.valueOf(arr[1]) == set.get(0)) {
                    set2.remove(Integer.valueOf(arr[0]));
                }
            }
            if (set2.size() == 0) {
                return set.get(0);
            } else {
                return -1;
            }
        } */
    }
}