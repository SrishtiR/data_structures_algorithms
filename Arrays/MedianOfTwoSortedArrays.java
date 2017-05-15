public class MedianOfTwoSortedArrays {
        /*13) Median of two sorted arrays in O(n) */
        public void medianOfTwoSortedArrays(int arr1[], int arr2[]) {
                int n = arr1.length;
                int arr[] = new int[2*n];
                int i=0;
                int j=0;
                int k=0;
                while(j<(2*n)){
                        if((arr1[i]<arr2[k])){
                                arr[j] = arr1[i];
                                j++;
                                i++;
                        } else {
                                arr[j] = arr2[k];
                                j++;
                                k++;
                                
                        }
                        
                }
                for(int i1=0;i1<(2*n);i1++)
                System.out.print(arr[i1]+" ");
        }
}
