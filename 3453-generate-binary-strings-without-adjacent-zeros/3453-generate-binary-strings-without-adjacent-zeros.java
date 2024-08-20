class Solution {
    static void rec(int index,int n, List<String>ans,String s){
        if(index==n){
            for(int i=0;i<n-1;i++){
                if(s.charAt(i)=='0'&&s.charAt(i+1)=='0'){
                    return;
                }
            }
            ans.add(s);
            return;
        }
        if(index>=n){
            return;
        }
        rec(index+1,n,ans,s+'0');
        rec(index+1,n,ans,s+'1');
    }
    public List<String> validStrings(int n) {
        List<String>ans=new ArrayList<>();
        String s="";
        int  index=0;
        rec(index,n,ans,s);
        return ans;
    }
}