public class MinimumDistanceBetweenTwoElements {
	/* 52. Minimum distance between two elements in an array O(n) approach */
	public int minimumDistanceBetweenTwoGivenElements(int arr[], int a, int b, int size) {
		int prev = -1;
		int i=0;
		int min_dist = Integer.MAX_VALUE;
		for(i=0;i<size;i++) {
			if((arr[i] == a || arr[i] == b)){
				prev = i;
				break;
			} 
			
		}
		for(;i<size;i++){
			if(arr[i] ==a || arr[i] ==b ){
				if(arr[prev] != arr[i] && (i-prev) < min_dist){
					min_dist = i-prev;
					prev =i;
				} else {
					prev = i;
				}
			}
		}
		return min_dist;
	}
}
