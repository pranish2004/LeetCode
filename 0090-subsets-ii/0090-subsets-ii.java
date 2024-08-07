class Solution {
    static void rec(int index, List<Integer>min, List<List<Integer>> ans,int nums[]){
        ans.add(new ArrayList<>(min));
        for(int i=index;i<nums.length;i++){
            if(i!=index&&nums[i]==nums[i-1])continue;
            min.add(nums[i]);
            rec(i+1,min,ans,nums);
            min.remove(min.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>min=new ArrayList<>();
        int index=0;
        Arrays.sort(nums);
        rec(index,min,ans,nums);
        return ans;
    }
}