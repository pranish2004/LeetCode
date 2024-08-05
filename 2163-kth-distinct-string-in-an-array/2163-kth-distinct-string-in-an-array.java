class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<String>ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])&&map.get(arr[i])==1){
             ans.add(arr[i]);
            }
        }
         if (k > ans.size()) {
            return "";
        }
        String s=ans.get(k-1);
        return s;
    }
}