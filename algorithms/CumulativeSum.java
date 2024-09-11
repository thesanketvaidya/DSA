package algorithms;


/*
   Initial Array: [1, 2, 3, 4]
   Cumulative Sum: [1, 3, 6, 10]
 
 */

public class CumulativeSum {

	public static void main(String[] args) {
		
		int[] arr = new int[]{1,2,3,4};
		
		int[] ans = getCumulativeSum(arr);
		
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		
	}
	
	public static int[] getCumulativeSum(int[] arr) {
		
		int[] ans = new int[arr.length]; 
		ans[0]=arr[0];
		for(int i=1;i<arr.length;i++){
			ans[i]=arr[i]+ans[i-1];
		}
		return ans;
		
	}

}
