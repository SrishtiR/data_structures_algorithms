public class CountNumberOfOccurences {
	int countOccurences(List<Integer> arrayList, int size, int x) {
		int count = 0;
		for(int i:arrayList) {
			if(i==x){
				count++;
			}
		}
		return count;
	}
}
