class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
       int n=g.length;
       int m=s.length;
       int s1=0;
       int e=0;
       int count=0;
       while(s1<n&&e<m){
        if(g[s1]<=s[e]){
            count++;
            s1++;
            e++;
        }
        else{
            e++;
        }
       } 
       return count;
    }
}