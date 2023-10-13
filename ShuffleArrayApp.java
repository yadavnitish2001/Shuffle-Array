package com.shuffleArray;

import java.util.Scanner;

public class ShuffleArrayApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//to get the size of array
		/*
		int n=scanner.nextInt();
		//creating an array
		int arr[]=new int[n];
		//get the input(array elements) from user
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
		*/
		 int[]arr={1,2,3,4,5,6,7};
		
		//displaying array elements before shuffling
		System.out.println("Array before Shuffling");
		for(int x: arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		//invoking the method by passing arguments as array(arr) reference and length of array and 
		//storing the returned array in new array
		int shuffledArray[]=ShuffleArray.shuffleArrayElements(arr,arr.length);
		//displaying array elements after shuffling
		System.out.println("Array after Shuffling");
		for(int x: shuffledArray) {
			System.out.print(x+" ");
		}


	}

}
