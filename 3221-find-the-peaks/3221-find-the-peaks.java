class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        int n=mountain.length;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=1;i<n-1;i++){
            if( mountain[i-1]< mountain[i]&& mountain[i]> mountain[i+1]){
                ans.add(i);
            }
        }
       return ans;
    }
}