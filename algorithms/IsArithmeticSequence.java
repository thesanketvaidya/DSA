package algorithms;

import java.util.Arrays;

public class IsArithmeticSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9, 13, 5, 15, 7, 11};
		System.out.println(isArithmeticSequence(arr));
	}

	static boolean isArithmeticSequence (int[] arr) {
		// add your logic here
		int size = arr.length;
		
		Arrays.sort(arr);
		
		int diff = arr[1]-arr[0];
		
		for(int i=2;i<size;i++){
			if(arr[i]-arr[i-1]!=diff){
				return false;
			}
		}
		return true;
	}
}
