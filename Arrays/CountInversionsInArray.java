pubic class CountInversionsInArray {
	public int countInversionsInArray(List<Integer> arrayList, int n){
		int count=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arrayList.get(i)>arrayList.get(j)){
					count++;
				}
			}
		}
		return count;
	}
}
