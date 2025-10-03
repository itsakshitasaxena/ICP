class Solution {
    public static List<List<Integer>> ans;
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        ans=new ArrayList<>();
        List<Integer> lst=new ArrayList<>();
        combo_sum(nums, 0, lst, target);
        return ans;
    }
    public void combo_sum(int[] nums, int idx, List<Integer> lst, int target){
        if(target<0)   return;
        if(target==0){
            ans.add(new ArrayList<>(lst));
            return;
        }
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1])
                continue;
            lst.add(nums[i]);
            combo_sum(nums, i+1, lst, target-nums[i]);
            lst.remove(lst.size()-1);
        }
    }
}