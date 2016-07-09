package karan.xgeneral;

public class powNN {

	
	public static double pow(int a, int b){
		if(b ==0){
			return 1;
		}
		double n = pow(a,b/2);
		if(b % 2 == 0){
			return (n*n);
		}else{
			if(b > 0){
				return a *n*n;
			}else{
				return (n*n)/a;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(5,-2));
	}

}
