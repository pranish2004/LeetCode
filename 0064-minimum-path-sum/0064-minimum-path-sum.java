class Solution {
    static int mem(int n,int m,int grid[][],int dp[][]){
        if(n==0&&m==0){
            return grid[n][m];
        }
        if(n<0||m<0){
            return Integer.MAX_VALUE;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
         int left=mem(n,m-1,grid,dp);
        int up=mem(n-1,m,grid,dp);
       
dp[n][m]=grid[n][m]+Math.min(left,up);
return dp[n][m];
    }
    public int minPathSum(int[][] grid) {
     int n=grid.length;
     int m=grid[0].length;
     int dp[][]=new int[n][m];
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            dp[i][j]=-1;
        }
     }   
   return mem(n-1,m-1,grid,dp);
    }
}