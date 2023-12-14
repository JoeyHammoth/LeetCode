class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int result = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            // First time will always last the entire duration
            if (i == 0) {
                result += duration;
            } else {
                // If time before overlaps with curr time when duration is added
                if (timeSeries[i-1] + duration - 1 >= timeSeries[i]) {
                    // add the duration overlapped
                    
                    // Another way to think abt this is to add the same duration time 
                    // to the previous and current time and finding the diff in both.
                    // This difference is the same since duration is the same for all
                    // times. 
                    result += timeSeries[i] - timeSeries[i-1];
                } else {
                    // if no overlap, just add the full duration
                    result += duration;
                }
            }          
        }
        return result;
    }
}