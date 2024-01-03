class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }

        int n = s.length();
        if (s.equals(goal)) {
            Set<Character> temp = new HashSet<>();
            for (char c : s.toCharArray()) {
                temp.add(c);
            }
            return temp.size() < goal.length(); // Swapping same characters
        }

        int i = 0;
        int j = n - 1;

        while (i < j && s.charAt(i) == goal.charAt(i)) {
            i++;
        }

        while (j >= 0 && s.charAt(j) == goal.charAt(j)) {
            j--;
        }

        if (i < j) {
            char[] sArr = s.toCharArray();
            char temp = sArr[i];
            sArr[i] = sArr[j];
            sArr[j] = temp;
            s = new String(sArr);
        }

        return s.equals(goal);
    }
}

/* class Solution {
    public boolean buddyStrings(String s, String goal) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                char[] arr = s.toCharArray();
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                String str = new String(arr);
                if (goal.equals(str)) {
                    return true;
                }
            }
        }    
        return false; 
    }
} */