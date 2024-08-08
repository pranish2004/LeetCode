
    class Solution {
    static void rec(int index,int n,List<List<Integer>>ans,int nums[], HashMap<List<Integer>,Integer>map){
        if(index==n){
             List<Integer>min=new ArrayList<>();
            for(int i=0;i<n;i++){
                min.add(nums[i]);
            }
        if(!map.containsKey(min)){
            ans.add(new ArrayList<>(min));
            map.put(min,1);
            return;
      }
        }
      if(index>=n){
        return;
      }
      for(int i=index;i<n;i++){
        swap(index,i,nums);
        rec(index+1,n,ans,nums,map);
        swap(index,i,nums);
      }

    }
    static int[] swap(int index,int i,int nums[]){
        int temp=nums[index];
        nums[index]=nums[i];
        nums[i]=temp;
        return nums;
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n=nums.length;
        int index=0;
       
        List<List<Integer>>ans=new ArrayList<>();
        int vis[]=new int[n];
        HashMap<List<Integer>,Integer>map=new HashMap<>();
        rec(index,n,ans,nums,map);
        return ans;
    }
}
  
