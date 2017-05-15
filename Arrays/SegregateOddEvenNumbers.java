public class SegregateOddEvenNumbers {
	public void segregateOddEvenNumbers(int arr[]) {
		int left =0;
		int right = arr.length -1;
		int temp;
		while(left<right) {
			while(arr[left]%2==0){
				left++;
			}
			while(arr[right]%2!=0){
				right--;
			}
			if(left!=right){
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		for(int i:arr){
			System.out.print(i);
		}
	}
}
