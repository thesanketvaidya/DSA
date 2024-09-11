package algorithms;

//Array: [1, 2, 3, 2, 1]
//Number of Identical Twins: 2
//Explanation:
//Identical Twins: [[1, 1], [2, 2]]
//Indexes: (0, 4), (1, 3)



public class IdenticalTwins {

	public static void main(String[] args) {
		int[] arr = {1,2,3,2,1};
		int ans = getIdenticalTwinsCount(arr);
		System.out.println("Total identical twins "+ans);

	}

	static int getIdenticalTwinsCount (int[] arr) {
		int count=0;
		int i=0;
		int j=arr.length-1;
		
		while(i<arr.length){		
			if(j>i){
				if(arr[j]==arr[i]){
				count++;
				}
				j--;
			}else{
				i++;
				j=arr.length-1;
			}
		}
		return count;
	}
}
