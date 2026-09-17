class Solution {
    public long shadowPairs(int[] nums) {
        ArrayList <Integer> stack = new ArrayList<>();
        long count =0;
        for ( int x: nums ){
            count += lowerBound (stack,x);
            while (!stack.isEmpty() && stack.get(stack.size()-1)>x){
                stack.remove(stack.size()-1);
            }
            stack.add(x);
        }
        return count ;
        
    }
    private int lowerBound (ArrayList<Integer>list,int x){
        int left =0;
        int right = list.size ();
        while (left < right ){
            int mid = left + (right - left )/2;
            if ( list.get (mid)<x){
                left = mid +1;

            }else {
                right = mid ;
            }
        }
        return left ;
    }
}