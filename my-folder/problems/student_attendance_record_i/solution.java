class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;
        int maxLate = 0;
        for (char i : s.toCharArray()) {
            if (i == 'A') {
                absent++;
            }
            if (i == 'L') {
                late++;
            } else {
                late = 0;
            }
            if (maxLate < late) {
                maxLate = late;
            }
        }
        if (absent >= 2 || maxLate >= 3) {
            return false;
        }
        return true;
    }
}