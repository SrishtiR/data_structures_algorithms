public class OddOccuringElement {
 /*6) Find the odd occuring element in an array
         * using bitwise XOR approach
         */
        public int oddOccuringElement(List<Integer> arrayList){
                int res = 0;
                int l = arrayList.size();
                for(int i=0;i<l;i++){
                        res = res ^ arrayList.get(i);
                        
                }
                return res;
        }
}
