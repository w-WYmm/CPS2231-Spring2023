package week3;

import java.util.Arrays;

//Purpose: to get the random array from 0 to 100
//			and get the average of the array
//main idea: using the Math.Random method and for loop
public class RandomArray {

	public static void main(String[] args) {
		//1. declare a double type array
		double [] arr = new double[100];
		
		//2.declare a variable
		double sum = 0;
		for(int i = 0; i < arr.length;i++) {
			arr[i] = Math.random()*100;
			sum += arr[i];
		}
		System.out.println("The array is " + Arrays.toString(arr));
		//3. compute the average of the array
		double average = sum / 100;
		System.out.println("The average of array is " + average);

	}

}
