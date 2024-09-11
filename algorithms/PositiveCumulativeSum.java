package algorithms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Initial Array: [1, -2, 3, 4, -6]
//Cumulative Sum: [1, -1, 2, 6, 0]
//Positive Cumulative Sum: [1, 2, 6]


public class PositiveCumulativeSum {

	public static void main(String[] args) {
		
		int[] arr = {1,-2,3,4,-6};
		List<Integer> ans = getPositiveCumulativeSum(arr);
		
		Iterator<Integer> it = ans.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}

	}
	
	static List<Integer> getPositiveCumulativeSum (int[] arr) {
		List<Integer> ans = new ArrayList<>();
		
		int prevVal=arr[0];
		
		if(arr[0]>0){
			ans.add(arr[0]);
		}
		
		for(int i=1;i<arr.length;i++){
			int val = arr[i]+prevVal;	
			if(val>0){
				ans.add(val);
			}
			prevVal=val;
		}

		return ans;
	}

}
