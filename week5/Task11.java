package week5;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.we should tell user enter a number of edge\
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter a edge of the matrix: ");
		int edge = input.nextInt();
		//2.initialize the matrix
		System.out.println("Enter a matrix row by row" );
		double [][] arr = new double[edge][edge];
		for(int i = 0 ; i < edge;i++) {
			for(int j = 0; j< edge;j++) {
				arr[i][j] = input.nextDouble();
			}
		}
		//3.invoke the method
		System.out.println("Average of the elements in matrix is " + 
		averageMajorDiagnoal(arr));
	}
	//Purpose: to compute the major diagonal of give martix
	//Signature: averageMajorDiagnoal double [][] ---> double
	//Example: 
	public static double averageMajorDiagnoal(double[][] m) {
		double sum = 0;
		for(int i = 0 ; i< m.length;i++) {
			sum += m[i][i]; 
		}
		double average = sum / m.length;
		return average;
	}
}
