class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] ar=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=i+1;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> lst=new ArrayList<>();
        combo(ar,0,k, lst,ans);
        return ans;
    }
    public void combo(int[] ar, int idx, int k, List<Integer> lst, List<List<Integer>> ans){
        if(lst.size()==k){
            ans.add(new ArrayList<>(lst));
            return;
        }
        for(int i=idx;i<ar.length;i++){
            lst.add(ar[i]);
            combo(ar, i+1,k,lst,ans);
            lst.remove(lst.size()-1);
        }
    }
}