public class ReverseAnArray {
 /* 14) Reversing an array -> Iterative approach */
        public void reverseArrayIterative(int arr[],int start, int end){
                
                int temp;
                
                while(start < end) {
                        temp = arr[start];
                        arr[start] = arr[end];
                        arr[end] = temp;
                        start++;
                        end--;
                        
                        }
                System.out.println("\n");
                for(int i:arr){
                        System.out.print(i+" ");
                }
                return;
        }
        
        /*15) Reversing an array -> Recursive approach */
        public void reverseArrayRecursive(int arr[],int start, int end) {
                int temp;
                if(start > end) {
                        System.out.println("\n");
                        for(int i:arr){
                                System.out.print(i+ " ");
                        }
                        return;
                }
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                reverseArrayRecursive(arr, start+1, end-1);
        }
        
}
