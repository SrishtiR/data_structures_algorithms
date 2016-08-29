public class MaxDifferenceBetweenTwoElementsLargerAppearsAfter {
	public int maxDiffWithLargeOnRightSide(int arr[], int n) {
		int max_diff = arr[1]-arr[0];
		int min = arr[0];
		for(int i=0; i<n ;i++) {
			if(arr[i]-min > max_diff) {
				max_diff = arr[i]-min;
			}
			if(arr[i]<min){
				min = arr[i];
			}
		}
		return max_diff;
	}
}
