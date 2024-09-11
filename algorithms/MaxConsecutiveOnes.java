package algorithms;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 1, 3, 2, 3, 1, 1, 1};
		int ans = getMaxConsecutiveOnes(arr);
		System.out.println(ans);
	}

	static int getMaxConsecutiveOnes(int[] A) {
	    // add your logic here
		int max = Integer.MIN_VALUE;
		int c=0;
		for(int i=0;i<A.length;i++){
			if(A[i]==1){
				c++;
				if(c>max){
					max=c;
				}
			}else{
				c=0;
			}
		}
		return max;
	}
}
