package week3;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The number of smaller than average" 
		+ count(new int[] {1,2,3,4} ));
		System.out.println("The number of smaller than average" 
				+ count(new int[] {2,3,10} ));

	}
	//Purpose: to find the number of smaller than average of array
	//Signature: method name -- input type ------> return type
	//			count(int []) ---------------> int
	//Example: count([1,2,3,4])---------> 1
	//			count([2,3,10])---------> 2
	
	public static int count(int[] arr){
		int sum = 0;
		//1. to get the average
		for(int i = 0 ; i < arr.length;i++) {
			sum += arr[i];
		}
		double average = sum / (arr.length *1.0);
		System.out.println(average);
		
		//2. to compare using for loop 
		//		and count the number
		int count = 0;
		for(int i =0; i< arr.length;i++) {
			if( arr[i] < average) {
				count++;
			}
		}
		return count;
	}
}
