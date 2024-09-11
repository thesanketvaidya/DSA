package algorithms;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1, 2, 3, 4, 4};
		int[] arr2 = {2, 4, 5, 5};
		int[] ans;
		ans= mergeSortedArrays(arr1, arr2);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}

	}

	static int[] mergeSortedArrays(int[] A, int[] B) {
	    // add your logic here
		int i=0,j=0,k=0;
		int size1=A.length;
		int size2=B.length;
		int[] ans = new int[(size1+size2)];
		while(i<size1 && j<size2){
			if(A[i]<B[j]){
				ans[k++]=A[i++];	
			}else{
				ans[k++]=B[j++];
			}
		}
		
		if(i<size1){
			while(i<size1){
				ans[k++]=A[i++];
			}
		}
		if(j<size2){
			while(j<size2){
				ans[k++]=B[j++];
			}
		}
		
		return ans;
		
	}
}
