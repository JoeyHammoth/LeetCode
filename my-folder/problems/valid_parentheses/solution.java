class Solution {
    public boolean isValid(String s) {
        List<Integer> order = new ArrayList<>();
        boolean result = true;
        int round = 0;
        int curl = 0;
        int square = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!result) {
                break;
            }
            switch (s.charAt(i)) {
                case '(':
                    order.add(1);
                    round++;
                    break;
                case ')':
                    if (round == 0 || order.get(order.size() - 1) != 1) {
                        result = false;
                    } else {
                        order.remove(order.size() - 1);
                        round--;
                    }
                    break;
                case '{':
                    order.add(2);
                    curl++;
                    break;
                case '}':
                    if (curl == 0 || order.get(order.size() - 1) != 2) {
                        result = false;
                    } else {
                        order.remove(order.size() - 1);
                        curl--;
                    }
                    break;
                case '[':
                    order.add(3);
                    square++;
                    break;
                case ']':
                    if (square == 0 || order.get(order.size() - 1) != 3) {
                        result = false;
                    } else {
                        order.remove(order.size() - 1);
                        square--;
                    }
                    break;
            }
        }
        if (!result) {
            return false;
        }
        if (round == 0 && curl == 0 && square == 0) {
            return true;
        } else {
            return false;
        }
    }
}