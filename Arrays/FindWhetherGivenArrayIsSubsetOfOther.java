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
}
