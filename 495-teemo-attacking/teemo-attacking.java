class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;

        for (int i = 0; i < timeSeries.length - 1; i++) {
            int gap = timeSeries[i + 1] - timeSeries[i];

            total += Math.min(gap, duration);
        }

        // Add the full duration for the last attack
        if (timeSeries.length > 0) {
            total += duration;
        }

        return total;
    }
}