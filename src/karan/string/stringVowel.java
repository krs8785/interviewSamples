package karan.string;

public class stringVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseVowel("hello"));
	}

	private static char[] reverseVowel(String s) {
		// TODO Auto-generated method stub
		int start =0;
		int end = s.length()-1;

		char[] c = s.toCharArray();
		while(start < end){
			boolean left = true;
			boolean right = true;
			if("aieou".indexOf(c[start]) < 0 && "AIEOU".indexOf(c[start]) < 0 ){
				left = false;
			}
			if("aieou".indexOf(c[end]) < 0 && "AIEOU".indexOf(c[end]) < 0){
				right = false;
			}
			if(left && right){
				char temp = c[end];
				c[end]= c[start];
				c[start]= temp;
				start++;
				end--;
			}else if (left == true && right == false){
				end--;
			}else{
				start++;
			}
		}
		return c;
	}

}
