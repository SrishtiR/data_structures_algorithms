public class UnionAndIntersectionOfTwoSortedArrays {
	/*32 Union and Intersection of two sorted arrays */
	public void unionAndIntersectionOfSortedArrays(List<Integer> listA, List<Integer> listB, int sizea, int sizeb){
		List<Integer> listC = new ArrayList<Integer>();
		List<Integer> listD = new ArrayList<Integer>();
		for(int i:listA){
			listC.add(i);
		}
		for(int i:listB) {
			if(!listC.contains(i)){
				listC.add(i);
			}
		}
		System.out.println("\nUnion:");
		
		System.out.print(listC);
		for(int i:listB){
			if(listA.contains(i)){
				listD.add(i);
			}
		}
		System.out.println("\nIntersection:");
		System.out.println(listD);
	}
}
