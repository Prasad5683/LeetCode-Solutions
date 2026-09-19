class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap <Integer,Integer>map = new HashMap<>();
        int n = nums.length ;
        int  max=0;
        int  Maxfreq=0;
        for ( int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            max = Math.max(max,map.get(nums[i]));
        }
         for ( int i=0;i<n;i++){
           if (map.get(nums[i])== max ){
            Maxfreq ++;
           }
        }
        return  Maxfreq ;
    }
}