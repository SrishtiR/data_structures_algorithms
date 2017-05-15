public class MissingNumber {
        /*8) Missing number sum approach*/
        public int missingInteger(List<Integer> arrayList) {
                int sum = 0;
                int l = arrayList.size();
                
                int s = (l+1)*(l+2)/2;
                int missingNumber;
                for(int i:arrayList){
                        sum = sum +i;
                }
                missingNumber = s - sum;
                return missingNumber;
        }
        
        /*9) Missing number XOR approach */
        public int missingIntegerXOR(List<Integer> arrayList){
                int size = arrayList.size();
                int res = 0, rres =0;
                int missingNumber;
                for(int i=0;i<size;i++){
                        res = res^arrayList.get(i);
                        
                }
                for(int i=1;i<size+1;i++){
                        rres = rres^i;
                }
                missingNumber = rres^res;
                return missingNumber;
        }
}
