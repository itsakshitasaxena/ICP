class Solution {
    public int longestOnes(int[] nums, int k) {
        int cnt=0,si=0,ei=0,zc=0;
        while(ei<nums.length){
            if(nums[ei]==0)   zc++; //zero count
            while(zc>k){
                if(nums[si]==0)
                    zc--;
                si++;
            }
            cnt=Math.max(ei-si+1, cnt);
            ei++;
        }
        return cnt;
    }
}