class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int count=0;
        for(int i=0;i<n-1;i=i+2){
           count+=nums[i];
        }
        return count;
    }
}