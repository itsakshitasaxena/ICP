class Solution {
    public int characterReplacement(String s, int k) {
        int si=0, ei=0, maxlen=0, maxfr=0;
        int[] fr=new int[26];
        while(ei<s.length()){
            fr[s.charAt(ei)-'A']++; //grow
            maxfr=Math.max(maxfr, fr[s.charAt(ei)-'A']);
            int  ws=ei-si+1; //window size
            if(ws-maxfr>k){ //window shrink
                fr[s.charAt(si)-'A']--;
                si++;
            }
            else{
                maxlen=Math.max(maxlen, ws); //update
            }
            ei++;
        }
        return maxlen;
    }
}