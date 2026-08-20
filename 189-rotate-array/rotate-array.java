class Solution {
    public static void Logic (int nums [], int m,int n){
        while (m<n){
         int   tmp= nums[m];
           nums[m]=nums[n];
           nums[n]= tmp;
           m++;
           n--;
        }
    }
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        k=k%n;
        if (n==1) return ;
        Logic(nums,0,n-k-1);
        Logic (nums,n-k,n-1);
        Logic(nums,0,n-1);

    }
}