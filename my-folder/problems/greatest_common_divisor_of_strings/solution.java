class Solution {
    public String gcdOfStrings(String str1, String str2) {
        /* List<Integer> factors = generateFactors(str1.length(), str2.length());
        Collections.reverse(factors);
        String shortStr = (str1.length() < str2.length()) ? str1 : str2;
        String longStr = (shortStr.equals(str1)) ? str2 : str1;
        for (int i : factors) {
            String sub = subStringGenerator(i, shortStr);
            if (substringDivides(sub, shortStr)) {
                if (substringDivides(sub, longStr)) {
                    return sub;
                }
            }
        } */
        int gcd = generateGCD(str1.length(), str2.length());
        String shortStr = (str1.length() < str2.length()) ? str1 : str2;
        String longStr = (shortStr.equals(str1)) ? str2 : str1;
        String sub = subStringGenerator(gcd, shortStr);
        if (substringDivides(sub, shortStr) && substringDivides(sub, longStr)) {
            return sub;
        }
        return ""; 
    }
    
    public int generateGCD(int a, int b) {
        int gcd = 0;
        int n = (a < b) ? a : b;
        for (int i = 1; i <= n; i++) {
            if (a % i == 0 && b % i == 0 && i > gcd) {
                gcd = i;
            }
        }
        return gcd;
    }

    /* public List<Integer> generateFactors(int a, int b) {
        List<Integer> list = new ArrayList<>();
        int n = (a < b) ? a : b;
        for (int i = 1; i <= n; i++) {
            if (a % i == 0 && b % i == 0) {
                list.add(i);
            }
        }
        return list;
    } */

    public String subStringGenerator(int a, String b) {
        char[] newstr = new char[a];
        for (int i = 0; i < a; i++) {
            newstr[i] = b.charAt(i);
        }
        String result = String.valueOf(newstr);
        return result;
    }

    public boolean substringDivides(String substr, String str) {
        int n = str.length() / substr.length();
        String result = "";
        for (int i = 0; i < n; i++) {
            result += substr;
        }
        return (str.equals(result)) ? true : false;
    }
}