class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        if(s.length()<p.length())   return ans;
        int[] fr1=new int[26];
        int[] fr2=new int[26];
        
        for(int i=0;i<p.length();i++)
            {
                fr1[s.charAt(i)-'a']++;
                fr2[p.charAt(i)-'a']++;
            }
        if(Arrays.equals(fr1,fr2))
                ans.add(0);

        int end=p.length(), start=0;
        while(end<s.length()){
            fr1[s.charAt(start)-'a']--;
            fr1[s.charAt(end)-'a']++;
            if(Arrays.equals(fr1,fr2))
                ans.add(start+1);
            end++; start++;

        }
        return ans;
    }
}