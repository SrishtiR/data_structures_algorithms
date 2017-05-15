public class MajorityElementInSortedArray{
	/* 27.	Check for Majority Element in a sorted array */
	public boolean isMajority(int[] a, int n){
		for(int i=0;i<n;i++){
			if(((i+(n/2))<n) && a[i]==a[i+(n/2)]){
				return true;
			}
		}
		return false;
	}
}
