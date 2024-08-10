class Solution {
    static void rec(int index,int n, List<Integer>min,  List<List<Integer>>ans,int nums[]){
        if(index==n){
           ans.add(new ArrayList<>(min));
           return;
        }
        if(index>n){
            return;
        }
        min.add(nums[index]);
        rec(index+1,n,min,ans,nums);
        min.remove(min.size()-1);
        rec(index+1,n,min,ans,nums);
    }
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>>ans=new ArrayList<>();
       List<Integer>min=new ArrayList<>();
        int index=0;
        rec(index,n,min,ans,nums);
        int outcome = 0;
        for (List<Integer> out : ans) {
            int m = out.size();
            if (m == 0) {
                continue;
            }
            int y = out.get(0);
            for (int i = 1; i < m; i++) {
                y ^= out.get(i);
            }
            outcome += y;
        }
        return outcome;
    }
    
}