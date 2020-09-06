class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int res = 0;
        while(res < citations.length && citations[citations.length - 1 - res] > res){
            res++;
        }
        return res;
    }
}
