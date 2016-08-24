package com.srishti.DSA;
import java.util.*;
public class Array {
        /* GeeksForGeeks Arrays.
         * 1) Problem to check whether a given sum is present in the array. 
         * O(n square) implementation 
         */
        public boolean givenSumPresentInArray(int a[], int s){
                int n = a.length;
                for(int i=0;i<n;i++){
                        for(int j=0;j<n;j++){
                                if(a[i]+a[j]==s){
                                        return true;
                                }
                        }
                }
                return false;
                }
        
        /* 2) Problem to check whether a given sum is present in the array. 
         * using sorting */
        public boolean givenSumPresentInArrayUsingSorting(int a[], int s){
                int n= a.length;
                Arrays.sort(a);
                int l = 0;
                int h = n-1;
                while(l<h){
                        if(a[l]+a[h]==s){
                                        return true;
                        }
                        if(a[l]+a[h]<s){
                                l++;
                        }
                        else{
                                h--;
                        }
                }
                return false;
                
        }
        /*3) Problem to check whether a given sum is present in the array.
         * Using array list and sorting
         */
        public boolean arrayListSumSort(List<Integer> arrayList, int s){
                Collections.sort(arrayList);
                int l = 0;
                int h = arrayList.size() -1;
                while(l<h){
                        if(arrayList.get(l) + arrayList.get(h) == s){
                                return true;
                        }
                        if(arrayList.get(l) + arrayList.get(h) < s) {
                                l++;
                        }
                        else{
                                h--;
                        }
                }
                return false;
        }
        
       /*4) Majority element 
         * O(n square) approach
          */
        public int majorityElement(List<Integer> arrayList){
                
                int count;
                int m;
                int size = arrayList.size() ;
                for(int i=0;i<size;i++){
                        count =0;
                        for(int j=0;j<size;j++){
                                if(arrayList.get(i)==arrayList.get(j)){
                                        count++;
                                        if(count>(size)/2){
                                                m = arrayList.get(i);
                                                return m;
                                        }
                                }
                        }
                }
                return 0;
        }
        
        /*5) Majority element using Moore's algorithm
         * O(n) approach
         */
        public int mooreMajorityElement(List<Integer> arrayList){
                int maj_index = 0;
                int count = 0;
                int size = arrayList.size();
                for(int i=0;i<size;i++){
                        if(arrayList.get(maj_index)==arrayList.get(i)){
                                count++;
                        } else {
                                count--;
                        }
                        if(count ==0){
                                maj_index = i;
                                count =1;
                        }
                }
                for(int i=0;i<size;i++){
                        if(arrayList.get(maj_index)==arrayList.get(i)){
                                count++;
                        }
                }
                if(count>size/2){
                        return arrayList.get(maj_index);
                } else{
                        return -1;
                }
                
                
        }
        /*6) Find the odd occuring element in an array
         * using bitwise XOR approach
         */
        public int oddOccuringElement(List<Integer> arrayList){
                int res = 0;
                int l = arrayList.size();
                for(int i=0;i<l;i++){
                        res = res ^ arrayList.get(i);
                        
                }
                return res;
        }
        /*7) Largest Sum Contiguous Subarray
         * Kandane's Algorithm
         * O(n) approach
         */
        public int largestSumContiguous(List<Integer> arrayList) {
                int max = 0;
                int sum = 0;
                for(int i:arrayList){
                        sum = sum + i;
                        if(sum < 0){
                                sum =0;
                        }
                        if(max<sum){
                                max =sum;
                        }
                        
                        
                }
                return max;
        }
        /* Largest Sum Contiguous Subarray
         *  Dynamic Programming
         */
        /*8) Missing number sum approach*/
        public int missingInteger(List<Integer> arrayList) {
                int sum = 0;
                int l = arrayList.size();
                
                int s = (l+1)*(l+2)/2;
                int missingNumber;
                for(int i:arrayList){
                        sum = sum +i;
                }
                missingNumber = s - sum;
                return missingNumber;
        }
        
        /*9) Missing number XOR approach */
        public int missingIntegerXOR(List<Integer> arrayList){
                int size = arrayList.size();
                int res = 0, rres =0;
                int missingNumber;
                for(int i=0;i<size;i++){
                        res = res^arrayList.get(i);
                        
                }
                for(int i=1;i<size+1;i++){
                        rres = rres^i;
                }
                missingNumber = rres^res;
                return missingNumber;
        }
             /*10 Searching for an element in a sorted and rotated array */
        public int searchInSortedRotatedArray(List<Integer> arrayList, int element){
                int pivot = 0;
                int ret1,ret2;
                int m=0;
                for(int i=1;i<arrayList.size();i++) {
                        //System.out.println(i);
                        if(arrayList.get(i) < arrayList.get(i-1)) {
                                pivot = i;
                        }
                }
                List<Integer> arr1 = new ArrayList<Integer>();
                List<Integer> arr2 = new ArrayList<Integer>();
                for(int i=0;i<pivot;i++){
                        arr1.add(i,arrayList.get(i));
                }
                for(int j=pivot;j<arrayList.size();j++){
                        arr2.add(m,arrayList.get(j));
                        m++;
                }
                ret1 =Collections.binarySearch(arr1, element);
                ret2 = Collections.binarySearch(arr2, element);
                if(ret1>0){
                        return ret1;
                } else {
                        return pivot+ret2;
                }
        }
        /*11) Searching for an element in a sorted and rotated array 
         * O(logn) approach */
        
        /*12) Merge an array of size n into another array of size m+n */
        
        public void mergeNintoMPlusN(int MN[], int N[]) {
                        
                        Arrays.sort(MN);
                        //System.out.println(MN);
                        int lm = MN.length;
                        int ln = N.length;
                        int i=ln;
                        int k=0,j=0;
                        while(k<lm){
                                if((i<lm) && (MN[i]<N[j]) || (j==ln)){
                                        MN[k] = MN[i];
                                        i++;
                                        k++;
                                        } else {
                                                MN[k] = N[j];
                                                k++;
                                                j++;
                                        }
                                
                        }
                        for(int b=0;b<MN.length;b++){
                        System.out.print(MN[b]+" ");
                        }
        }
        
        /*13) Median of two sorted arrays in O(n) */
        public void medianOfTwoSortedArrays(int arr1[], int arr2[]) {
                int n = arr1.length;
                int arr[] = new int[2*n];
                int i=0;
                int j=0;
                int k=0;
                while(j<(2*n)){
                        if((arr1[i]<arr2[k])){
                                arr[j] = arr1[i];
                                j++;
                                i++;
                        } else {
                                arr[j] = arr2[k];
                                j++;
                                k++;
                                
                        }
                        
                }
                for(int i1=0;i1<(2*n);i1++)
                System.out.print(arr[i1]+" ");
        }


        /* 14) Reversing an array -> Iterative approach */
        public void reverseArrayIterative(int arr[],int start, int end){
                
                int temp;
                
                while(start < end) {
                        temp = arr[start];
                        arr[start] = arr[end];
                        arr[end] = temp;
                        start++;
                        end--;
                        
                        }
                System.out.println("\n");
                for(int i:arr){
                        System.out.print(i+" ");
                }
                return;
        }
        
        /*15) Reversing an array -> Recursive approach */
        public void reverseArrayRecursive(int arr[],int start, int end) {
                int temp;
                if(start > end) {
                        System.out.println("\n");
                        for(int i:arr){
                                System.out.print(i+ " ");
                        }
                        return;
                }
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                reverseArrayRecursive(arr, start+1, end-1);
        }
        
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
	
	/*18) Array rotation temp array approach*/
	public void rotate(int arr[],int d,int n){
		int temp[] = new int[d];
		
		for(int i=0;i<d;i++){
			temp[i] = arr[i];
			}
		for(int i=0;i<(n-d);i++){
			arr[i] = arr[i+d];
		}
		for(int i=0;i<d;i++){
			arr[n-d+i] = temp[i];
		}
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
	
	/* 19) Array rotation (one by one rotate) O(n*d)*/
	public void rotateArrayOneByOne(int arr[], int d, int n){
		for(int i=0;i<d;i++){
			arrayRotate(arr,d,n);
		}
		for(int i=0;i<n;i++){
		System.out.print(arr[i]);
		}
	}
	public void arrayRotate(int arr[], int d, int n) {
		int temp = arr[0];
		for(int i=0; i<(n-1);i++){
			arr[i] = arr[i+1];
		}
		arr[n-1] = temp;
	}
	
	/*GCD */
	
	/* 20) Reversal algorithm for array rotation */
	public void reversalAlgoForArrayRotation(int arr[], int d, int n) {
		reverseArrayIterative(arr, 0, d-1);
		reverseArrayIterative(arr, d, n-1);
		reverseArrayIterative(arr, 0, n-1);
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
	/*21) Maximum sum such that no two elements are adjacent O(n)*/
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
	
	/*22) Sort elements by frequency */
	public void sortElementsByFrequency(List<Integer> arrayList, int n){
		List<Integer> countList = new ArrayList<Integer>();
		int temp,temp1;
		int count=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(arrayList.get(i)==arrayList.get(j)){
					count++;
					}
				countList.add(i,count);
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(countList.get(i)>countList.get(j)){
					temp = countList.get(i);
					temp1 = arrayList.get(i);
					//countList.add(i) = countList.get(j);
				}
			}
		}
	}
	/* 23.Two elements whose sum is closest to zero O(n square approach)*/
	public void numbersWithSumClosestToZero(int arr[], int n) {
		int cursum = Integer.MAX_VALUE, sum =Integer.MAX_VALUE;
		int a = 0,b = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i!=j){
					cursum = arr[i]+arr[j];
					if(cursum < 0){
						cursum = -cursum;
					}
					if(cursum<sum) {
						sum = cursum;
						a = arr[i];
						b = arr[j];
					}
				}
			}
		}
		System.out.println(a+" "+b);
	}
	/* 24.Two elements whose sum is closest to zero. Using sorting */
	public void numbersWithSumClosestToZeroSorting(int arr[], int n) {
		Arrays.sort(arr);
		int cursum = Integer.MAX_VALUE;
		int sum = Integer.MAX_VALUE;
		int l=0,r=(n-1);
		int a=0, b=0;
		while(l<r) {
			cursum = arr[l]+arr[r];
			if(Math.abs(cursum)<Math.abs(sum)) {
				sum = cursum;
				a=arr[l];
				b=arr[r];
			}
			if(arr[l]+arr[r]<0){
				l++;
			}
			if(arr[l]+arr[r]>0) {
				r--;
			}
		}
		System.out.println(a+" "+b);
	}
	
	/* 25. Count Inversions in an array */
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
	/* 26. Find the smallest and second smallest element in an array */
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
	/* 27.	Check for Majority Element in a sorted array */
	public boolean isMajority(int[] a, int n){
		for(int i=0;i<n;i++){
			if(((i+(n/2))<n) && a[i]==a[i+(n/2)]){
				return true;
			}
		}
		return false;
	}
	
	/* 28. Segregating 0s and 1s in an array Method1 */
	public void segregateZeroesAndOnes(int arr[], int n) {
		int count=0;
		for(int i=0;i<n;i++){
			if(arr[i] == 0){
				count++;
			}
		}
		for(int i=0;i<n;i++){
			if(i<count){
				arr[i] = 0;
			} else {
				arr[i] = 1;
			}
		}
		for(int i:arr){
			System.out.print(i);
		}
	}
	/* 29. Segregating 0s and 1s. Method 2 */
	public void segregateZeroesAndOnesOptimized(int arr[], int n) {
		int left = 0;
		int right = n-1;
		while(left < right) {
			while(arr[left]==0 && left<right) {
				left++;
			}
			while(arr[right] ==1 && left<right){
				right--;
			}
			if(left<right){
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			}
		}
		for(int i:arr){
			System.out.print(i);
		}
	}
	/*30. K largest element is an array. Using Sorting */
	public void kLargestElementsInArray(List<Integer> arrayList, int n, int k) {
		Collections.sort(arrayList);
		for(int i=(n-k);i<n;i++){
			System.out.println(arrayList.get(i));
		}
	}
	/* 31. Maximum difference between two elements such that larger element appears after the smaller number */
	public int maxDiffWithLargeOnRightSide(int arr[], int n) {
		int max_diff = arr[1]-arr[0];
		int min = arr[0];
		for(int i=0; i<n ;i++) {
			if(arr[i]-min > max_diff) {
				max_diff = arr[i]-min;
			}
			if(arr[i]<min){
				min = arr[i];
			}
		}
		return max_diff;
	}
	/*32 Union and Intersection of two sorted arrays */
	public void unionAndIntersectionOfSortedArrays(List<Integer> listA, List<Integer> listB, int sizea, int sizeb){
		List<Integer> listC = new ArrayList<Integer>();
		List<Integer> listD = new ArrayList<Integer>();
		for(int i:listA){
			listC.add(i)
;		}
		for(int i:listB) {
			if(!listC.contains(i)){
				listC.add(i);
			}
		}
		System.out.println("\nUnion:");
		
		System.out.print(listC);
		for(int i:listB){
			if(listA.contains(i)){
				listD.add(i);
			}
		}
		System.out.println("\nIntersection:");
		System.out.println(listD);
	}
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
	/* 34.A Product Array Puzzle */
	public void productArrayPuzzle(int arr[], int size) {
		int[] prod = new int[size];
		int[] low = new int[size];
		int[] high = new int[size];
		low[0]=1;
		high[0]=1;
		for(int i=0;i<size;i++){
		
		}
	}
	/* 35. Segregate odd and even numbers */
	public void segregateOddEvenNumbers(int arr[]) {
		int left =0;
		int right = arr.length -1;
		int temp;
		while(left<right) {
			while(arr[left]%2==0){
				left++;
			}
			while(arr[right]%2!=0){
				right--;
			}
			if(left!=right){
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		for(int i:arr){
			System.out.print(i);
		}
	}
	/* 40. Find the two repeating elements in a given array O(nlogn) */
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
	
	/* 41. Sort an array of 0s, 1s and 2s */
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
	/* 42. Find duplicates in O(n) time and O(1) extra space (the array contains elements from 0 to n-1) */
	public void findDuplicatesInOnTime(int[] arr, int size) {
		for(int i=0;i<size;i++){
			if(arr[Math.abs(arr[i])] > 0){
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			} else {
				System.out.println(i+"th element is repeating");
			}
		}
	}
	
	/* 43. Equilibrium index of an array */
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
		//	System.out.println(i+" "+sumlow+" "+sumhigh);
			if(sumlow == sumhigh){
				System.out.println(i);
			}
		}
	}
	/* 44. Turn an image by 90 degrees */
	
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
	/* 47. Find the smallest missing number binary search like approach*/
	int findFirstMissing(int[] array,int start, int end){
		if(start>end){
			return end+1;
		}
		if(start != array[start]) {
			return start;
		}
		int mid = (start+end)/2;
		if(array[mid]>mid){
			return findFirstMissing(array,start,mid);
		} else {
			return findFirstMissing(array,mid+1,end);
		}
	}
        
}
