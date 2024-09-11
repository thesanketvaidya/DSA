package algorithms;

public class LargestContiguousSubarraySum {
	
	public static void main(String[] args) {
		
		int[] arr = {4, -6, 2, 5};
		int ans = largestContiguousSum(arr);
		System.out.println(ans);
	}
	static int largestContiguousSum(int[] arr){
		
		int currSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
	}
}
