class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        Stack<Integer>stk= new Stack<>();
        Arrays.sort(nums);
        stk.push(nums[0]);
        for( int i =0;i<n;i++){
            if (nums[i]!=stk.peek()){
                stk.push(nums[i]);
            }
        }
         if (stk.size()<3){
    
            return stk.peek();
        }else {
            stk.pop();
            stk.pop();

            return stk.pop();
        }
        
    }
}