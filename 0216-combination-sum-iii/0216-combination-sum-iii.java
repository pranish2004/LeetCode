class Solution {
     static void rec(int index,int target,int arr[],List<Integer>min,	List<List<Integer>>ans,int n,	HashMap<List<Integer>,Integer>map,int count,int k){
        if(target==0&&count==k){
            if(!map.containsKey(min)){
            ans.add(new ArrayList<>(min));
            map.put(min,1);
            return;
            }
        }
        if(index==9||target<0){
            return;
        }
           min.add(arr[index]);
        rec(index+1,target-arr[index],arr,min,ans,n,map,count+1,k);
         min.remove(min.size()-1);
        rec(index+1,target,arr,min,ans,n,map,count,k);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        	int arr[]=new int[9];
	for(int i=0;i<9;i++){
	    arr[i]=i+1;
	}

	List<Integer>min=new ArrayList<>();
	List<List<Integer>>ans=new ArrayList<>();
	int index=0;
	HashMap<List<Integer>,Integer>map=new HashMap<>();
    int count=0;
	rec(index,n,arr,min,ans,n,map,count,k);
    return ans;
    }
}