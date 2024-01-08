class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int N = deck.length;
        int[] count = new int[10000];
        for (int c: deck)
            count[c]++;

        List<Integer> values = new ArrayList();
        for (int i = 0; i < 10000; ++i)
            if (count[i] > 0)
                values.add(count[i]);

        search: for (int X = 2; X <= N; ++X)
            if (N % X == 0) {
                for (int v: values)
                    if (v % X != 0)
                        continue search;
                return true;
            }

        return false;

        /* Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : deck) {
            map.put(i, (map.containsKey(i)) ? Integer.valueOf(map.get(i) + 1) : Integer.valueOf(1));
        }

        int x = 0;
        boolean first = true;
        for (Map.Entry<Integer, Integer> element : map.entrySet()) {
            if (first) {
                first = false;
                x = element.getValue();
            } else {
                if (x != element.getValue()) {
                    if ((x % element.getValue() != 0 && x > element.getValue()) || (element.getValue() % x != 0 && x < element.getValue())) {
                        return false;
                    }
                }
            }
        }
        
        if (deck.length == 1) {
            return false;
        }
        return true; */




        // Shite 
        /* Arrays.sort(deck);
        int currX = 1;
        int highX = 1;
        boolean firstChange = false;
        for (int i = 1; i < deck.length; i++) {
            if (deck[i-1] == deck[i]) {
                currX++;
            } else {
                if (!firstChange) {
                    firstChange = true;
                    highX = currX;
                }
                if (currX != highX) {
                    return false;
                }
                currX = 1;
            }
        }
        if ((currX != highX && firstChange) || (highX == 1 && firstChange) || deck.length == 1) {
            return false;
        }
        return true; */
    }
}