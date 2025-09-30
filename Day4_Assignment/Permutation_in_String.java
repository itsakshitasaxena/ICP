class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] fr1=new int[26];
        int[] fr2=new int[26];
        for(int i=0;i<s1.length();i++)
            fr1[s1.charAt(i)-'a']++;
        for(int i=0;i<s2.length();i++){
            fr2[s2.charAt(i)-'a']++;
            if(i>=s1.length())
                fr2[s2.charAt(i-s1.length())-'a']--;
            if(Arrays.equals(fr1, fr2))
                return true;        
        }
        return false;
    }
}