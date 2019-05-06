class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<>();
        long alower = (long)lower, aupper = (long)upper;
        for (int num : nums) {
            if (num == alower) {
                alower++;
            } else if (alower < num) {
                if (alower + 1 == num) {
                    res.add(String.valueOf(alower));
                } else {
                    res.add(alower + "->" + (num - 1));
                }
                alower = (long) num + 1;
            }
        }
        if (alower == aupper) res.add(String.valueOf(alower));
        else if (alower < aupper) res.add(alower + "->" + aupper);
        return res;
    }
}
