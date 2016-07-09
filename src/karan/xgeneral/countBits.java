package karan.xgeneral;

public class countBits {

	public static int[] countBits(int[] array1){
		int[] res = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			res[i] = countEach(array1[i]);
		}
		return res;
	}
	
	private static int countEach(int i) {
		// TODO Auto-generated method stub
		int result =  0;
		while(i != 0){
			if(i % 2 == 1){
				result ++;
			}
			i = i/2;
		}
		return result;
		
		
	}

	
	
	public static int[] countBitsImproved(int num) {
	    int[] result = new int[num+1];
	 
	    int p = 1; //p tracks the index for number x
	    int pow = 1;
	    for(int i=1; i<=num; i++){
	        if(i==pow){
	            result[i] = 1;
	            pow <<= 1;
	            p = 1;
	        }else{
	            result[i] = result[p]+1;
	            p++;
	        }
	 
	    }
	 
	    return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countBitsImproved(8));
	}

}
