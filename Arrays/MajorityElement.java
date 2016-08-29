public class MajorityElement {
/*4) Majority element 
         * O(n square) approach
          */
        public int majorityElement(List<Integer> arrayList){
                
                int count;
                int m;
                int size = arrayList.size() ;
                for(int i=0;i<size;i++){
                        count =0;
                        for(int j=0;j<size;j++){
                                if(arrayList.get(i)==arrayList.get(j)){
                                        count++;
                                        if(count>(size)/2){
                                                m = arrayList.get(i);
                                                return m;
                                        }
                                }
                        }
                }
                return 0;
        }
        
        /*5) Majority element using Moore's algorithm
         * O(n) approach
         */
        public int mooreMajorityElement(List<Integer> arrayList){
                int maj_index = 0;
                int count = 0;
                int size = arrayList.size();
                for(int i=0;i<size;i++){
                        if(arrayList.get(maj_index)==arrayList.get(i)){
                                count++;
                        } else {
                                count--;
                        }
                        if(count ==0){
                                maj_index = i;
                                count =1;
                        }
                }
                for(int i=0;i<size;i++){
                        if(arrayList.get(maj_index)==arrayList.get(i)){
                                count++;
                        }
                }
                if(count>size/2){
                        return arrayList.get(maj_index);
                } else{
                        return -1;
                }
                
                
        }
}
