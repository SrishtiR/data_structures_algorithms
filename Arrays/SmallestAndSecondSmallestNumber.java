public class SmallestAndSecondSmallestNumber{
	public void smallestAndSecondSmallestElement(List<Integer> arrayList, int n) {
		int min = Integer.MAX_VALUE;
		int smin = Integer.MAX_VALUE;
		int odiff = Integer.MAX_VALUE;
		int diff;
		for(int i:arrayList) {
			if(i<min) {
				min = i;
			}
		}
		for(int i:arrayList){
			diff = Math.abs(min-i);
			if(diff<odiff && diff!=0) {
				odiff = diff;
				smin = i;
			}
		}
		System.out.println(min+" "+smin);
	}
}
