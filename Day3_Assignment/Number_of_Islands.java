class Solution {
    public int numIslands(char[][] grid) {
        int island=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){ // only if there is land
                    island++;
                    is_Island(grid, i, j); // now check
                }
            }
        }
        return island;
    }
    public void is_Island(char[][] ar, int i, int j){
        if(i<0 || i>= ar.length||j<0 || j>= ar[0].length)   return;
        if(ar[i][j]=='0')  return; //if already visited then return

        ar[i][j]='0'; //mark as visited
        
        is_Island(ar, i+1, j); // for vertically upper row
        is_Island(ar, i-1, j); // for vertically lower row
        is_Island(ar, i, j+1); // for horizontally upper row
        is_Island(ar, i, j-1); // for horizontally lower row
    }
}