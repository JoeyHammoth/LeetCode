class Solution {
    public String[] findWords(String[] words) {
        // Create arraylist for results since we don't know how many words there will be
        // in the final array
        List<String> resultList = new ArrayList<>();

        // Create char arrays for all of the keyboard rows
        Character[] row1 = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        Character[] row2 = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
        Character[] row3 = {'z', 'x', 'c', 'v', 'b', 'n', 'm'};

        // Make the arrays sets so we can use contains method
        Set<Character> rowSet1 = new HashSet<>(Arrays.asList(row1));
        Set<Character> rowSet2 = new HashSet<>(Arrays.asList(row2));
        Set<Character> rowSet3 = new HashSet<>(Arrays.asList(row3));

        // check whether the current iterator is the first letter of the word
        // check whether the word is worthy of being placed in the list
        boolean firstLetter;
        boolean word;

        // to record the first letter of each word
        Character fl = 'a';
        
        // The idea is to check the first letter of each word and see which row that letter
        // belongs to. If any of the following letters are not in that same row, the word is 
        // automatically discarded. Otherwise, the word will be placed in the list after
        // all of the letters are checked. 

        // Note that toLowerCase is used since all of the letters in the rowsets are in uppercase
        // and if any letters are in uppercase, the contains method wont work. 
        for (String i : words) {
            firstLetter = true;
            word = true;
            for (Character j : i.toCharArray()) {
                if (firstLetter) {
                    firstLetter = false;
                    fl = Character.toLowerCase(j);
                }
                
                if (rowSet1.contains(fl)) {
                    if (!rowSet1.contains(Character.toLowerCase(j))) {
                        word = false;
                        break;
                    }
                }

                if (rowSet2.contains(fl)) {
                    if (!rowSet2.contains(Character.toLowerCase(j))) {
                        word = false;
                        break;
                    }
                }

                if (rowSet3.contains(fl)) {
                    if (!rowSet3.contains(Character.toLowerCase(j))) {
                        word = false;
                        break;
                    }
                }

            }
            if (word) {
                resultList.add(i);
            }
        }
        
        // Make the final array to be returned.
        String[] result = new String[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
        
    }
}