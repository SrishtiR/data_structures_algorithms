public class TwoElementsWithSumClosestToZero{
	/* 23.Two elements whose sum is closest to zero O(n square approach)*/
	public void numbersWithSumClosestToZero(int arr[], int n) {
		int cursum = Integer.MAX_VALUE, sum =Integer.MAX_VALUE;
		int a = 0,b = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i!=j){
					cursum = arr[i]+arr[j];
					if(cursum < 0){
						cursum = -cursum;
					}
					if(cursum<sum) {
						sum = cursum;
						a = arr[i];
						b = arr[j];
					}
				}
			}
		}
		System.out.println(a+" "+b);
	}
	/* 24.Two elements whose sum is closest to zero. Using sorting */
	public void numbersWithSumClosestToZeroSorting(int arr[], int n) {
		Arrays.sort(arr);
		int cursum = Integer.MAX_VALUE;
		int sum = Integer.MAX_VALUE;
		int l=0,r=(n-1);
		int a=0, b=0;
		while(l<r) {
			cursum = arr[l]+arr[r];
			if(Math.abs(cursum)<Math.abs(sum)) {
				sum = cursum;
				a=arr[l];
				b=arr[r];
			}
			if(arr[l]+arr[r]<0){
				l++;
			}
			if(arr[l]+arr[r]>0) {
				r--;
			}
		}
		System.out.println(a+" "+b);
	}
}
