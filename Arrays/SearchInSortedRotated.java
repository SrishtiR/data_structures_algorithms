public class SearchInSortedRotated {
         /*10 Searching for an element in a sorted and rotated array */
        public int searchInSortedRotatedArray(List<Integer> arrayList, int element){
                int pivot = 0;
                int ret1,ret2;
                int m=0;
                for(int i=1;i<arrayList.size();i++) {
                        //System.out.println(i);
                        if(arrayList.get(i) < arrayList.get(i-1)) {
                                pivot = i;
                        }
                }
                List<Integer> arr1 = new ArrayList<Integer>();
                List<Integer> arr2 = new ArrayList<Integer>();
                for(int i=0;i<pivot;i++){
                        arr1.add(i,arrayList.get(i));
                }
                for(int j=pivot;j<arrayList.size();j++){
                        arr2.add(m,arrayList.get(j));
                        m++;
                }
                ret1 =Collections.binarySearch(arr1, element);
                ret2 = Collections.binarySearch(arr2, element);
                if(ret1>0){
                        return ret1;
                } else {
                        return pivot+ret2;
                }
        }
        /*11) Searching for an element in a sorted and rotated array 
         * O(logn) approach */
        
}
