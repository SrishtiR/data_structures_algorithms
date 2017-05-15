public class GivenSumPresentInArray {    
    /* GeeksForGeeks Arrays.
         * 1) Problem to check whether a given sum is present in the array. 
         * O(n square) implementation 
         */
        public boolean givenSumPresentInArray(int a[], int s){
                int n = a.length;
                for(int i=0;i<n;i++){
                        for(int j=0;j<n;j++){
                                if(a[i]+a[j]==s){
                                        return true;
                                }
                        }
                }
                return false;
                }
        
        /* 2) Problem to check whether a given sum is present in the array. 
         * using sorting */
        public boolean givenSumPresentInArrayUsingSorting(int a[], int s){
                int n= a.length;
                Arrays.sort(a);
                int l = 0;
                int h = n-1;
                while(l<h){
                        if(a[l]+a[h]==s){
                                        return true;
                        }
                        if(a[l]+a[h]<s){
                                l++;
                        }
                        else{
                                h--;
                        }
                }
                return false;
                
        }
        /*3) Problem to check whether a given sum is present in the array.
         * Using array list and sorting
         */
        public boolean arrayListSumSort(List<Integer> arrayList, int s){
                Collections.sort(arrayList);
                int l = 0;
                int h = arrayList.size() -1;
                while(l<h){
                        if(arrayList.get(l) + arrayList.get(h) == s){
                                return true;
                        }
                        if(arrayList.get(l) + arrayList.get(h) < s) {
                                l++;
                        }
                        else{
                                h--;
                        }
                }
                return false;
        }
  }
