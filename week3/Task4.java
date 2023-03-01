package week3;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
//Purpose: to enter 10 numbers for saving to an array
//			and find the largest and smallest number
//			than swap them
	public static void main(String[] args) {
		//1.to tell user entering 10 numbers
		//using for loop
		Scanner input = new Scanner(System.in);
		int [] arr = new int[10];
		for(int i =0 ; i < arr.length;i++) {
			System.out.println("Please enter numbers " + (i+1) + "/10");
			arr[i] = input.nextInt();
		}
		input.close();
		System.out.println("The input array is " + Arrays.toString(arr));
		//2.find the largest and smallest
		int smallest = arr[0];
		int largest = arr[0];
		int indexOfSmal = 0, indexOfLar = 0;
		for(int i = 0; i <arr.length;i++ ) {
			if(arr[i] > largest) {
				largest = arr[i];
				indexOfLar = i;
			}
			if(arr[i] < smallest) {
				smallest = arr[i];
				indexOfSmal = i;
			}
			
		}
		int temp = arr[indexOfLar];
		arr[indexOfLar] = arr[indexOfSmal];
		arr[indexOfSmal] = temp;
		//3.show the result
		System.out.println("After changing the array is " + Arrays.toString(arr));

	}

}
