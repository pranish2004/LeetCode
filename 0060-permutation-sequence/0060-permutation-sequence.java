class Solution {
        static int fact(int n){
        int sum=1;
        for(int i=1;i<=n;i++){
            sum*=i;
        }
        return sum;
    }
	 public String getPermutation(int n, int k) {
	k=k-1;
ArrayList<Integer>arr=new ArrayList<>();
	for(int i=0;i<n;i++){
	    arr.add(i+1);
	}
    int ans=0;
while(arr.size()>0){
      int temp = fact(arr.size() - 1);
            int index = k / temp;
            ans=ans*10+arr.get(index);
            arr.remove(index);
            k = k % temp;
}  
return Integer.toString(ans);
    }
}