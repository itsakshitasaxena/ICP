class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a,b)-> ((a[0]==b[0])?a[1]-b[1]:b[0]-a[0]));
// height is same(a[0]) then sort on basis of a[1] else sort on height basis
        List<int[]> lst=new ArrayList<>();
        for(int[] a:people){
            lst.add(a[1], a);// adding on basis of its index by a[1] then shift it
        }
        return lst.toArray(new int[lst.size()][2]);
    }
}