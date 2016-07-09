package karan.string;

public class stringReverseXOR {

	public static void reverse(String k){
		System.out.println(k);
		char s[] =k.toCharArray();
		for(int i=0,j=s.length-1;i<=j;i++,j--){
			s[i] ^= s[j]; 
			s[i] ^= (s[j] ^= s[i]);
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		String k ="heloo";
		
		reverse(k);
		
	}
}
