package com.java.Array;

public class SecondLargest {
	public static void main(String[] args) {
		int nums[]= {8, 8, 7, 6, 5};
		System.out.println(secondLagestEle(nums));
		
	}
	
	private static int secondLagestEle(int nums[]) {
		int largest =nums[0]; //8
		int secondLargest=-100000000;
		
		for(int i=1;i<nums.length;i++) {
			if(nums[i]>largest) {
				secondLargest=largest;
				largest=nums[i];
			}
			else if (nums[i] <largest && secondLargest<nums[i]){
				secondLargest=nums[i];
			}
		}
		
		return secondLargest;
	}

}
