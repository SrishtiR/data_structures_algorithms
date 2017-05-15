public class FindRepeatingAndMissingElement {
	/* 53. Find the repeating and the missing 
	using hashmap
	time complexity O(n) */
	public void findRepeatingAndMissing(int[] arr, int size){
		int missing = 0,repeating=0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<size;i++){
			if(map.containsValue(arr[i])){
				repeating = arr[i];
			} else{
			map.put(i, arr[i]);
			}
		}
		for(int i=1;i<=size;i++){
			if(!map.containsValue(i)){
				missing = i;
			}
		}
		System.out.println(missing+" "+repeating);
	}
}
