public class SortArrayOf0s1sAnd2s {
	public void sortAnArrayOf0s1sAnd2s(List<Integer> arrayList, int n) {
		int c1=0, c2=0;
		for(int i:arrayList) {
			if(i==0){
				c1++;
			} else if(i==1){
				c2++;
			}
		}
		
		arrayList.clear();
		System.out.println();
		for(int i=0;i<n;i++) {
			if(i<c1){
			arrayList.add(i,0);
			} if(i>=c1 && i<(c2+c1)){
				arrayList.add(i,1);
			} if(i>=(c2+c1)) {
				arrayList.add(i,2);
			}
			
		}
		System.out.println(arrayList);
		
	}
}
