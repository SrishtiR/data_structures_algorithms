public class ArrayRotation {
	/*18) Array rotation temp array approach*/
	public void rotate(int arr[],int d,int n){
		int temp[] = new int[d];
		
		for(int i=0;i<d;i++){
			temp[i] = arr[i];
			}
		for(int i=0;i<(n-d);i++){
			arr[i] = arr[i+d];
		}
		for(int i=0;i<d;i++){
			arr[n-d+i] = temp[i];
		}
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
	
	/* 19) Array rotation (one by one rotate) O(n*d)*/
	public void rotateArrayOneByOne(int arr[], int d, int n){
		for(int i=0;i<d;i++){
			arrayRotate(arr,d,n);
		}
		for(int i=0;i<n;i++){
		System.out.print(arr[i]);
		}
	}
	public void arrayRotate(int arr[], int d, int n) {
		int temp = arr[0];
		for(int i=0; i<(n-1);i++){
			arr[i] = arr[i+1];
		}
		arr[n-1] = temp;
	}
	
	/*GCD */
	
	/* 20) Reversal algorithm for array rotation */
	public void reversalAlgoForArrayRotation(int arr[], int d, int n) {
		reverseArrayIterative(arr, 0, d-1);
		reverseArrayIterative(arr, d, n-1);
		reverseArrayIterative(arr, 0, n-1);
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
}
