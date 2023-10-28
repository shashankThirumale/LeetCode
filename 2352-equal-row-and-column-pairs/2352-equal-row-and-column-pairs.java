class Solution {
    public boolean check(int[][] grid, int row, int column){
        int n=grid.length;
        for(int i=0; i<n; i++){
            if(grid[i][row]!=grid[column][i]){
                return false;
            }
        }
        return true;
    }

    public int equalPairs(int[][] grid) {
        int ans=0;
        int n=grid.length;
        for(int i=0; i<n; i++){
            for(int y=0; y<n; y++){
                if(grid[0][i]==grid[y][0]){
                    if(check(grid, i, y)){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}