package karan.xgeneral;

public class nThFibonacci {

	public static int recursiveFib(int n){
		if(n <= 0)
	        return 0;

	    if(n == 1)
	        return 1;

	    return recursiveFib(n - 1) + recursiveFib(n - 2);
	}
	
	public static int iterativeFib(int n){
		int results[] = {0,1};
		if(n<2){
			return results[n];
		}
		int first = 1;
		int second = 0;
		int res =0;
		for (int i = 2; i <=n; i++) {
			res = first + second;
			second = first;
			first = res;
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		System.out.println(recursiveFib(5));
		System.out.println(iterativeFib(5));
	}
}
