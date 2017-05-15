public class KLargestElementsInArray {
	/*30. K largest element is an array. Using Sorting */
	public void kLargestElementsInArray(List<Integer> arrayList, int n, int k) {
		Collections.sort(arrayList);
		for(int i=(n-k);i<n;i++){
			System.out.println(arrayList.get(i));
		}
	}
}
