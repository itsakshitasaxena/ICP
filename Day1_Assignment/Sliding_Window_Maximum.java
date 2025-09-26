class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans=new int[nums.length-k+1];
        int ind=0;
        Deque<Integer> dq=new ArrayDeque<>(); 
        //specifying deque of integer otherwise it returns an object
        
        for(int i=0;i<nums.length;i++){

            //remove numbers out of range k
            if (!dq.isEmpty() && dq.peek() == (i - k))
                dq.poll();

            // removing smaller elements in k range
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i])
                dq.pollLast();

            dq.offer(i);
            if(i>=k-1){
                ans[ind++]=nums[dq.peek()];
            }
        }
        return ans;
    }
}