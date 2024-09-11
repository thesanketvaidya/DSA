package algorithms;

import java.util.ArrayList;
import java.util.List;

public class PrimesUptoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ans = primesUptoN(10);
		for(Integer val:ans) {
			System.out.println(val);
		}

	}
	static List<Integer> primesUptoN(int n) {
	    List<Integer> ans = new ArrayList<>();
		
		for(int i=2;i<=n;i++){
			if(isPrime(i)){
				ans.add(i);
			}
		}
		return ans;
	}
	
	static boolean isPrime(int n){
		for(int j=2;j<n;j++){
			if(n%j==0){
				return false;
			}
		}
		return true;
	}
}
