public class FindDuplicates {
	/* 42. Find duplicates in O(n) time and O(1) extra space (the array contains elements from 0 to n-1) */
	public void findDuplicatesInOnTime(int[] arr, int size) {
		for(int i=0;i<size;i++){
			if(arr[Math.abs(arr[i])] > 0){
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			} else {
				System.out.println(i+"th element is repeating");
			}
		}
	}
}
