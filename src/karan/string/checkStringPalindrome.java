package karan.string;

public class checkStringPalindrome {

	public static boolean isPalindrome(String input){
		if(input.length() == 0){
			return true;
		}else{
			int len = input.length();
			for(int i=0;i<len/2;i++){
				if(input.charAt(i) != input.charAt(len -1 -i)){
					return false;
				}
			}
			return true;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("mabcam"));
	}
}
