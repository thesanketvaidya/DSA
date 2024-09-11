package algorithms;

import java.util.ArrayList;
import java.util.List;


//Array: [42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442]
//Answer: 42, 5775, 34, 45, 3556

public class EvenNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442};
		List<Integer> ans = getEvenDigitNumbers(arr);
		for(Integer i:ans) {
			System.out.println(i);
		}

	}

	static List<Integer> getEvenDigitNumbers (int[] arr) {
		List<Integer> ans = new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			String str = Integer.toString(arr[i]);
			
			if(str.length()%2==0){
				ans.add(arr[i]);
			}
			
		}
		return ans;
	}
}
