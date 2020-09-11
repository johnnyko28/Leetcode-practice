class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE;
        for (int num : nums){
            if (num <= min) min = num;
            else if (num < secMin) secMin = num;
            else if (num > secMin) return true;
        }
        return false;
    }
}
