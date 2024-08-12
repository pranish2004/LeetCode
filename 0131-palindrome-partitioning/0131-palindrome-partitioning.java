class Solution {
    static void rec(int index,int n,String s,	List<List<String>>ans,	List<String>min){
    if(index==n){
        ans.add(new ArrayList<>(min));
        return;
    }
    if(index>n){
        return;
    }
    for(int i=index;i<n;i++){
        if(ispal(s.substring(index,i+1))){
            min.add(s.substring(index,i+1));
             rec(i+1,n,s,ans,min);
          min.remove(min.size()-1);
        }
       
    }
}    

static Boolean ispal(String s){
    StringBuilder d=new StringBuilder(s);
    String d1=d.reverse().toString();
    return(d1.equals(s));
}
    public List<List<String>> partition(String s) {
        	int n=s.length();
	int index=0;
	List<List<String>>ans=new ArrayList<>();
	List<String>min=new ArrayList<>();
	rec(index,n,s,ans,min);
    return ans;
    }
}