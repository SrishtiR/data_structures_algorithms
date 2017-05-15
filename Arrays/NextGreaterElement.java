public class NextGreaterElement {
	/*45. Next Greater Element O(n sqaure)*/
	public void NGE(int[] arr, int size) {
		int e;
		for(int i=0;i<size;i++){
			e=0;
			for(int j=i+1;j<size;j++){
				if(arr[j]>arr[i]){
					System.out.println("NGE of"+arr[i]+" is "+arr[j]);
					e=1;
					break;
				}
			}
			if(e==0){
				System.out.println("NGE of "+arr[i]+" is -1");
			}
		}
	}
	
	/* 46. NGE using stacks */
	public void NGEStacks(int arr[], int size){
		Stack<Integer> st = new Stack<Integer>();
		
		int element, next;
		int i= 0;
		st.push(arr[0]);
		
		for(i=1;i<size;i++) {
			next = arr[i];
			if(!st.empty()) {
				element = (Integer) st.pop();
				while(element<next) {
					System.out.println("\n "+element+"-->"+next);
					if(st.empty()){
						break;
					}
					element = (Integer) st.pop();
				}
				if(element > next) {
					st.push(element);
				}
			}
			st.push(next);
		}
		while(!st.empty()){
			element = (Integer) st.pop();
			next = -1;
			System.out.println("\n "+element+"-->"+next);
			
		}
	}
}
