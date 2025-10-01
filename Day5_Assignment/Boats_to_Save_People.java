class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boats=0, lo=0, hi=people.length-1;
        Arrays.sort(people);
        while(lo<=hi){
            if(people[lo]+people[hi]<=limit){
                lo++;
            }
            boats++;
            hi--;
        }
        return boats;
    }
}