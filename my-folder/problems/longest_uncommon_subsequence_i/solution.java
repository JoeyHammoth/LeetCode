class Solution {
    public int findLUSlength(String a, String b) {
        // If the 2 strings are the same, there is no uncommon subsequence, therefore return -1
        if (a.equals(b)) {
            return -1;
        }
        // The longer string length is returned since if the two strings are different, then
        // the whole string can be treated as a unique subsequence which is different from the 
        // other. Therefore, the length of the longer string is returned.
        return (a.length() > b.length()) ? a.length() : b.length();
        
    }
}