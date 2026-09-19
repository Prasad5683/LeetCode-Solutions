class Solution {
    public List<Integer> findDuplicates(int[] arr) {
       int max =0;
         for ( int i=0;i<arr.length;i++){
             max = Math.max(max,arr[i]);
         }
         int dummy []= new int [max +1];
         for ( int i=0;i<arr.length;i++){
             dummy[arr[i]]++;
         }
         ArrayList<Integer>list = new ArrayList<>();
          for ( int i=0;i<dummy.length;i++){
             if( dummy[i]>1){
                 list.add(i);
             }
         }
         return list; 
    }
}