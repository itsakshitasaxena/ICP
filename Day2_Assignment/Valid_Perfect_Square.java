class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)  return true;
        int lo=1,hi=num;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            long sq=(long)mid*mid;
            if(num==sq)
                return true;
            else if(num>sq)
                lo=mid+1;
            else
                hi=mid-1;
        }
        return false;
    }
}