public class MaxDiffIndex {
	/* 49. Given an array arr[], find the maximum j – i such that arr[j] > arr[i] */
	public int maxJIArrJMoreThanArrI(int arr[], int size){
		int maxdiff=Integer.MIN_VALUE;
		int diff;
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				
				if(arr[j]>arr[i]){
				diff = j-i;
				if(diff>maxdiff){
					maxdiff = diff;
				}
				}
			}
		}
		return maxdiff;
	}
}
