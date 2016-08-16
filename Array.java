package com.srishti.DSA;
import java.util.*;
public class Array {
        /* GeeksForGeeks Arrays.
         * 1) Problem to check whether a given sum is present in the array. 
         * O(n square) implementation 
         */
        public boolean arraySum(int a[], int s){
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
        public boolean arraySumSort(int a[], int s){
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
        
        
        
}
