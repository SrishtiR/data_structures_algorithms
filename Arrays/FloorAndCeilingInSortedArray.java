public class FloorAndCeilingInSortedArray{
	/* 33. Floor and Ceiling in a sorted array */
	public void floorAndCeilingInAnArray(int arr[], int n, int x){
		int ceil = -1, floor = -1;
		
		for(int i=1;i<n;i++) {
			if(arr[i] == x && arr[i+1] == x){
				ceil = x;
				floor = x;
				System.out.println("Ceil:"+ceil+"Floor:"+floor);
				break;
			}
			else if(arr[i] == x){
				ceil = arr[i-1];
				floor = arr[i+1];
				System.out.println("Ceil:"+ceil+"Floor:"+floor);
				break;
			}
			
		}
		if(ceil == -1){
			System.out.println("Ceil doesnt exist");
		}
		if(floor == -1){
			System.out.println("Floor doesnt exist");
		}
		if(ceil== -1 && floor == -1){
			System.out.println("Ceil and floor do not exist");
		}
	}
}
