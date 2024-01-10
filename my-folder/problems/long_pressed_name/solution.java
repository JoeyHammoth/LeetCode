class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int m = name.length(), n = typed.length();
        int i = 0, j = 0;
        
        while(i < m && j < n){
            char c1 = name.charAt(i), c2 = typed.charAt(j);
            if(c1 != c2) return false; // we are handling different chars, no!
            
			// count of consecutive c1/c2
            int count1 = 0; 
            while(i < m && name.charAt(i) == c1){
                count1++;
                i++;
            }
            
			// count of consecutive c1/c2
            int count2 = 0; 
            while(j < n && typed.charAt(j) == c2){
                count2++;
                j++;
            }
            
            if(count2 < count1) return false;
        }
        
		// they both reach the end
        return i == m && j == n;


        
        
        /* Map<Character, Integer> nameMap = new HashMap<>();
        Map<Character, Integer> typedMap = new HashMap<>();

        List<Character> nameList = new ArrayList<>();
        List<Character> typeList = new ArrayList<>();

        char[] nameArr = name.toCharArray();
        char[] typedArr = typed.toCharArray();

        for (int i = 0; i < nameArr.length; i++) {
            if (i != 0) {
                if (nameArr[i] != nameArr[i-1]) {
                    nameList.add(nameArr[i]);
                }
            } else {
                nameList.add(nameArr[i]);
            }
        }

        for (int i = 0; i < typedArr.length; i++) {
            if (i != 0) {
                if (typedArr[i] != typedArr[i-1]) {
                    typeList.add(typedArr[i]);
                }
            } else {
                typeList.add(typedArr[i]);
            }
        }

        for (Character i : name.toCharArray()) {
            nameMap.put(i, (nameMap.containsKey(i)) ? nameMap.get(i) + 1 : 1);
        }
        for (Character i : typed.toCharArray()) {
            typedMap.put(i, (typedMap.containsKey(i)) ? typedMap.get(i) + 1 : 1);
        }
        for (Map.Entry<Character, Integer> element : nameMap.entrySet()) {
            if (!typedMap.containsKey(element.getKey())) {
                return false;
            }
            if (element.getValue() > typedMap.get(element.getKey())) {
                return false;
            }
        }

        System.out.println(nameList);
        System.out.println(typeList);

        if (!nameList.equals(typeList)) {
            return false;
        }
        
        return true; */
    }
}