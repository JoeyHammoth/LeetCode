class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] string = s.split(" "); //Seperate strings in s seperated by space
        HashSet<String> words = new HashSet<>();
        HashSet<Character> characters = new HashSet<>();

        // Dumping shit into the unique shit pile
        for (String i : string) {
          words.add(i);
        }
        for (char i : pattern.toCharArray()) {
          characters.add(i);
        }
        
        // If number of unique words is not equal to the number of pattern symbols, 
        // it is automatically false
        if (words.size() != characters.size() || pattern.length() != string.length) {
          return false;
        }

        // Under the assumption that there is only a and b possible. 

        for (int i = 1; i < pattern.length(); i++) {

          if (pattern.charAt(i) == pattern.charAt(i-1)) {
            if (!string[i].equals(string[i-1])) {
              return false;
            }
          } else {
            if (string[i].equals(string[i-1])) {
              return false;
            }
          }
        }
        
        return true;
    }
}