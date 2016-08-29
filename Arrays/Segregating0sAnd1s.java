public class Segregating0sAnd1s {
	/* 28. Segregating 0s and 1s in an array Method1 */
	public void segregateZeroesAndOnes(int arr[], int n) {
		int count=0;
		for(int i=0;i<n;i++){
			if(arr[i] == 0){
				count++;
			}
		}
		for(int i=0;i<n;i++){
			if(i<count){
				arr[i] = 0;
			} else {
				arr[i] = 1;
			}
		}
		for(int i:arr){
			System.out.print(i);
		}
	}
	/* 29. Segregating 0s and 1s. Method 2 */
	public void segregateZeroesAndOnesOptimized(int arr[], int n) {
		int left = 0;
		int right = n-1;
		while(left < right) {
			while(arr[left]==0 && left<right) {
				left++;
			}
			while(arr[right] ==1 && left<right){
				right--;
			}
			if(left<right){
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			}
		}
		for(int i:arr){
			System.out.print(i);
		}
	}
}
