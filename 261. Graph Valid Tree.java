class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (n == 1 && edges.length == 0) return true;
        if (n < 1 || edges == null || edges.length != n - 1) return false;
        
        int[] roots = new int[n];
        for (int i = 0; i < n; i++){
            roots[i] = -1;
        }
        
        for (int[] pair : edges) {
            int x = find(roots, pair[0]);
            int y = find(roots, pair[1]);
            if (x == y) return false;
            roots[x] = y;
        }
        return true;
    }
    
    private int find(int[] roots, int i){
        while(roots[i] != -1){
            i = roots[i];
        }
        return i;
    }
}
