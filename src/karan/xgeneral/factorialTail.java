package karan.xgeneral;

public class factorialTail {

	
	public static int  fact(int result, int n){
		if(n ==1){
			return result;
		}else{
			result = result  * n;
			return fact(result, n-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(1,2));
	}

}
