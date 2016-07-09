package karan.string;

public class stringPermutationPalindromeCheck {

	public static void permString(String prefix, String str){
		if(str.length() == 0){
			System.out.println(prefix);
		}else{
			for (int i = 0; i < str.length(); i++) {
				permString(prefix + str.charAt(i), str.substring(0,i)+str.substring(i+1,str.length()));
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permString("", "tactcoa");
	}

}
