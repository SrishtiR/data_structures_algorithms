public class FindTwoRepeatingElementsInArray {
	public void findTwoRepeatingElementsInArray(List<Integer> arraylist, int n){
		Collections.sort(arraylist);
		int a = Integer.MIN_VALUE;
		int b = Integer.MIN_VALUE;
		
		for(int i=1;i<n;i++){
			if(arraylist.get(i)-arraylist.get(i-1)==0){
				if(a==Integer.MIN_VALUE){
				a = arraylist.get(i);
				} else{
					b=arraylist.get(i);
				}
			}
		}
		System.out.println(a+" "+b);
	}
}
