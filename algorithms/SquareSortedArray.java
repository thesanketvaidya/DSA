package algorithms;

import java.util.Arrays;

public class SquareSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {6, -8, 3, -1, 4};
		int[] ans = getSquareSortedArray(arr);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}
	static int[] getSquareSortedArray (int[] arr) {
		int[] ans = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			ans[i]=arr[i]*arr[i];
		}
		Arrays.sort(ans);
		return ans;
	}
}
