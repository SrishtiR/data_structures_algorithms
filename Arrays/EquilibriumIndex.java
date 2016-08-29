public class EquilibriumIndex {
	public void equilibrium(int[] arr, int size){
		int sumlow = 0, sumhigh = 0;
		for(int i=0;i<size;i++){
			sumlow=0;
			sumhigh=0;
			for(int j=0;j<i;j++){
				sumlow = sumlow+arr[j];
			}
			for(int k=i+1;k<size;k++){
				sumhigh = sumhigh + arr[k];
			}
		
			if(sumlow == sumhigh){
				System.out.println(i);
			}
		}
	}
}
