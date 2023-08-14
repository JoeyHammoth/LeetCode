class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i : digits) {
            arr.add(i);
        }
        for (int j = arr.size() - 1; j >= 0; j--) {
            if (arr.get(j) + 1 == 10) {
                arr.set(j, 0);
                if (j == 0) {
                    arr.add(0, 1);
                }
            } else {
                arr.set(j, arr.get(j) + 1);
                break;
            }
        }
        int[] result = new int[arr.size()];
        for (int k = 0; k < arr.size(); k++) {
            result[k] = arr.get(k);
        }
        return result;
    }
}