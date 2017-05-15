public class MaximumSumSuchThatNoTwoElementsAdjacent {
	public int maximumSumSuchThatNoElementsAdjacent(List<Integer> arrayList, int n) {
		int incl,excl;
		int excl_new;
		incl = arrayList.get(0);
		excl = 0;
		for(int i=1;i < n; i++) {
			excl_new = (incl > excl) ? incl:excl;
			incl = excl + arrayList.get(i);
			excl = excl_new;
		}
		return (incl>excl)?incl:excl;
	}
}
