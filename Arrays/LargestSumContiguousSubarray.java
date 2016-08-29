public class LargestSumContiguousSubarray {
/*7) Largest Sum Contiguous Subarray
         * Kandane's Algorithm
         * O(n) approach
         */
        public int largestSumContiguous(List<Integer> arrayList) {
                int max = 0;
                int sum = 0;
                for(int i:arrayList){
                        sum = sum + i;
                        if(sum < 0){
                                sum =0;
                        }
                        if(max<sum){
                                max =sum;
                        }
                        
                        
                }
                return max;
        }
        /* Largest Sum Contiguous Subarray
         *  Dynamic Programming
         */
       
}
