class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] answer = new String[score.length];
        int[] scorecpy = Arrays.copyOf(score, score.length); 
        Arrays.sort(scorecpy);
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < scorecpy.length; j++) {
                if (score[i] == scorecpy[j]) {
                    if (j == scorecpy.length - 1) {
                        answer[i] = "Gold Medal";
                    } else if (j == scorecpy.length - 2) {
                        answer[i] = "Silver Medal";
                    } else if (j == scorecpy.length - 3) {
                        answer[i] = "Bronze Medal";
                    } else {
                        answer[i] = Integer.toString(scorecpy.length - j);
                    }
                    break;
                }
            }
        }
        return answer;
    }
}