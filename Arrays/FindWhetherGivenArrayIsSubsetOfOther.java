public class FindWhetherGivenArrayIsSubsetOfOther {
	/* 50. Find whether an array is subset of another array
	 *  using hashtable 
	 *  does not work if there are repetitions */
	public boolean findWhetherArrayIsSubsetOfAnother(int[] arr1, int[] arr2, int size1, int size2){
		Hashtable<Integer,Integer> array = new Hashtable<Integer,Integer>();
		for(int i=0;i<size1;i++){
			array.put(i, arr1[i]);
		}
		for(int i=0;i<size2;i++){
			if(!array.containsValue(arr2[i])){
				return false;
			}
		}
		return true;
	}
	/* 51. Find whether an array is subset of another array 
	 * using sorting and merging 
	 * works in case of repetitions */
	public boolean findWhetherArrayIsSubsetOfAnotherSS(int[] arr1, int[] arr2, int size1, int size2){
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i=0,j=0;
		while(i<size1 && j<size2){
			if(arr1[i]<arr2[j]){
				i++;
			}
			else if(arr1[i]==arr2[j]){
				i++;
				j++;
			} else if(arr1[i] > arr2[j]) {
				return false;
			}
			
		}
		if(j<size2)
			return false;
		else
			return true;
	}
}
