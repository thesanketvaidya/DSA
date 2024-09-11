package algorithms;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5, 4, 2, 5, 3, 1};
		insertionSort(arr);
		for(int val:arr) {
			System.out.println(val);
		}
	}
	
	static void insertionSort(int[] arr) {
		
		for(int i=1;i<arr.length;i++){	
			int val =arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>val){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=val;	
		}
		
	}

}
