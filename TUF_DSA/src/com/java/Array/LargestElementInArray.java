package com.java.Array;

public class LargestElementInArray {
	
	public static void main(String[] args) {
		
	}
	
	public void largestElement(int nums[]) {
		int largest=nums[0];
		for(int i =1; i<nums.length;i++) {
			if(largest<nums[i]) {
				largest=nums[i];
			}
		}
	}
}
