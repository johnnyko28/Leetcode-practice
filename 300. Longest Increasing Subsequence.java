class Solution {
    public int lengthOfLIS(int[] nums) {
        int[]dp = new int[nums.length];
        int res = 0;
        for (int num : nums){
            int i = 0, j = res;
            while(i != j){
                int mid = (i + j) / 2;
                if (dp[mid] < num){
                    i = mid + 1;
                } else {
                    j = mid;
                }
            }
            dp[i] = num;
            if (i == res) res++;
        }
        return res;
    }
}
