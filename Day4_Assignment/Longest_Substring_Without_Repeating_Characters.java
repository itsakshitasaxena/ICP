class Solution {
    public int lengthOfLongestSubstring(String s) {
        int si=0, ei=0, ans=0;
        HashSet<Character> set=new HashSet<>();
        while(ei<s.length()){
            while(si<ei && set.contains(s.charAt(ei))){
                set.remove(s.charAt(si));
                si++;
            }
            set.add(s.charAt(ei));
            ans=Math.max(ei-si+1, ans);
            ei++;
        }
        return ans;
    }
}