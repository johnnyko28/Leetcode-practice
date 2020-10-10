class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        
        if(intervals.length == 0) {
            return new int[][]{newInterval};
        }
        int i = 0;
        while(i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        //Merge the overlapping intervals
        int intervalStart = newInterval[0], intervalEnd = newInterval[1];
        while(i < intervals.length && intervals[i][0] <= newInterval[1]) {
            intervalStart = Math.min(intervalStart,intervals[i][0]);
            intervalEnd = Math.max(intervalEnd, intervals[i][1]);
            i++;                
        }
        result.add(new int[]{intervalStart, intervalEnd});
        while(i < intervals.length && intervals[i][1] > newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][2]);
    }
}
