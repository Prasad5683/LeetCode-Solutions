class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        ArrayList<Integer>list = new ArrayList<>();
        int frq[]= new int [n+1];
        for ( int i =0;i<n;i++){
            frq[nums[i]]++;
        }
        for ( int i =1;i<n+1;i++){
            if (frq[i]==0){
                list.add(i);
            }
        }
        return list;

        

    }
}