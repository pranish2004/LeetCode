class Solution {
     static void rec(int index,int target,int candidates[],	List<Integer>min,	List<List<Integer>>ans,int n){
        if(target==0){
            ans.add(new ArrayList<>(min));
            return;
           
        }
        if(index==n||target<0){
            return;
        }
           min.add(candidates[index]);
        rec(index,target-candidates[index],candidates,min,ans,n);
         min.remove(min.size()-1);
        rec(index+1,target,candidates,min,ans,n);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n=candidates.length;
        	List<Integer>min=new ArrayList<>();
	List<List<Integer>>ans=new ArrayList<>();
	int index=0;
	
	rec(index,target,candidates,min,ans,n);
    return ans;
    }
}