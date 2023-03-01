package week3;

public class Task3 {

	public static void main(String[] args) {
		System.out.println("The index of largest number is " + 
	findIndexOfLargestNumber(new int [] {1,33,4,20}));
		System.out.println("The index of largest number is " + 
				findIndexOfLargestNumber(new int [] {2,4,55,999}));
		System.out.println("The index of largest number is " + 
				findIndexOfLargestNumber(new int [] {2,1}));

	}
	//Purpose: to find the biggest number and
	//		return index of the largest
	//Signature: findIndexOfLargestNumber---------int[]   -----------int
	//Example: findIndexOfLargestNumber([1,33,4,20]) ------------1
	//			findIndexOfLargestNumber([2,4,55,999])-------3
	//			findIndexOfLargestNumber([2,1]) ---- 0
	
	public static int findIndexOfLargestNumber(int [] arr) {
		//1. declare the variable for index and largest number
		int index = 0, largest = arr[0];
		//2.for loop to find
		for(int i =0 ;i < arr.length;i++) {
			if(arr[i] > largest) {
				largest = arr[i];
				index = i;
			}
		}
		return index;
	}
}
