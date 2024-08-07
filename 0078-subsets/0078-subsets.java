class Solution {
    public static void rec(int index,int n,List<List<Integer>>ans,int nums[],List<Integer>min){
        if(index==n){
            ans.add(new ArrayList<>(min));
            return;
        }
        if(index==n){
            return;
        }
        min.add(nums[index]);
        rec(index+1,n,ans,nums,min);
        min.remove(min.size()-1);
        rec(index+1,n,ans,nums,min);

    }
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>min=new ArrayList<>();
        rec(0,n,ans,nums,min);
        return ans;
    }
}