class Solution {
    public int kthGrammar(int N, int K) {
        if(K == 1 ) return 0;
        if(K % 2 ==0 ) return 1- kthGrammar(0, K/2);
        else return kthGrammar(0,(K+1)/2);
    }
}
