class Solution {
    public int lengthOfLastWord(String s) {
        String[] result = s.split(" ", 0);
        String resulting = result[result.length - 1];
        int resultant = resulting.length();
        return resultant;
    }
}