public class LeadersInArray {
/* 16) Leaders in an array O(n square) approach*/
        public void leadersInArray(List<Integer> arrayList){
                int len = arrayList.size();
                int i=0;
                int j=0;
                System.out.println("\n");
                while(i<len){
                        j=i+1;
                        if(j==len){
                                System.out.println(arrayList.get(i));
                        }
                        while(j<len){
                                if(arrayList.get(i)<arrayList.get(j)) {
                                        break;
                                } else {
                                        j++;
                                        if(j==len){
                                                System.out.println(arrayList.get(i));
                                        }
                                }
                        }
                        i++;
                        
                }
        }
        
    /*17) Leaders in an array O(n) approach */
		public void leadersInArrayFromEnd(List<Integer> arrayList) {
		  int len = arrayList.size();
			int max_from_end = arrayList.get((len-1));
			System.out.print(max_from_end);
			for(int i=(len-2);i>=0;i--){
				if(arrayList.get(i)>max_from_end){
					max_from_end = arrayList.get(i);
					System.out.print(" "+max_from_end);
				}
			}
					
		}
}
