class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
         Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        for (int i = 0; i < intervals.length-1; i++) {
            int[] first = intervals[i];
            int[] second = intervals[i+1];
            if (second[0] < first[1]) return false;
        }
        return true;
    }
}
