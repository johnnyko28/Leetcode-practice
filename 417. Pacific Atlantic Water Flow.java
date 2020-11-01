class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        if(matrix.length == 0) return new ArrayList<>();
        int[][] fill = new int[matrix.length][matrix[0].length];
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i < matrix.length; i++) {
               dfs(matrix, i, 0, Integer.MIN_VALUE, fill, 1);
               dfs(matrix, i, matrix[0].length - 1, Integer.MIN_VALUE, fill, 2);
        }
        for(int i = 0 ; i < matrix[0].length; i++) {
               dfs(matrix, 0, i, Integer.MIN_VALUE, fill, 1);
               dfs(matrix, matrix.length - 1, i, Integer.MIN_VALUE, fill, 2);
        }
        
        for(int i = 0 ; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(fill[i][j] == 3) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    ans.add(list);
                }
            }
        }
        return ans;
    }
    private void dfs(int[][] matrix, int i, int j, int parent, int[][] fill, int ocean) {
        //Bounds check.
        if(i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length) return;
        // Value check.
        if(fill[i][j] == ocean || fill[i][j] == 3 || matrix[i][j] < parent) return;
        fill[i][j] += ocean;
        dfs(matrix, i + 1, j, matrix[i][j], fill, ocean) ;
        dfs(matrix, i - 1, j, matrix[i][j], fill, ocean);
        dfs(matrix, i, j + 1, matrix[i][j], fill, ocean);
        dfs(matrix, i, j - 1, matrix[i][j], fill, ocean);
    }
}
