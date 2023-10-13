package com.shuffleArray;
import java.util.Random;

public class ShuffleArray {
	//creating static method with int type return type
	public static int[] shuffleArrayElements(int[] arr,int n) {
		//creating random object which will generate random numbers
		Random r=new Random();
		for (int i = 0; i < n; i++) {
			//generating random numbers from 0-(i+1)
			int j=r.nextInt(i+1);
			//swapping ith element with jth element
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;	
		}
		//returning shuffled array
		return arr;
		
	}

}
