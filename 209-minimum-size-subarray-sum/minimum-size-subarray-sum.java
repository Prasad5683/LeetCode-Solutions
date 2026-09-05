class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int curr=0,ans = Integer.MAX_VALUE ;
        int j=0;
        for ( int i=0;i<n;i++){
            curr +=nums[i];
            while (j<=i && curr - nums[j] >= target){
                curr-=nums[j];
                j++;
            }
            if ( curr >= target){
                ans = Math.min(ans , i-j+1);
            }
        }
        return ans == Integer.MAX_VALUE ?  0 : ans ;
        
    }
}