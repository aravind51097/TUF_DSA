package com.java.Array;

public class LinearSearch {
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,3,3,2};
		int target = 1;
		System.out.println(linearSearching(a, target));
		
	}
	
	public static int linearSearching(int[] arr , int target ) 
	{
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i] == target) {
				return 1;
			}
		}		
		return -1;
	}

}
