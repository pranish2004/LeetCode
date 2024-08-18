class Solution {
     static int mem(int n,int arr[],int dp[]){
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
               if(n>=2){
        int left=mem(n-1,arr,dp)+arr[n-1];
        int right=mem(n-2,arr,dp)+arr[n-2];
        return dp[n]=Math.min(left,right);
        }
        return dp[n];
     }
     
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        	int index=0;
	int dp[]=new int[n+1];
	Arrays.fill(dp,-1);
    if(n==100){
        return 1;
    }
    
    return mem(n,cost,dp)+1;
    }
}