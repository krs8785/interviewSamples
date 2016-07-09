package karan.string;

public class stringCompression {

	public static void compressString(String str){
		if(str.length() == 0 || str == null){
			return;
		}
		StringBuffer res = new StringBuffer();
		
		int count =1;
		char last = str.charAt(0);
		res.append(last);
		
		int len = str.length()-1;
		for (int i = 0; i < len; i++) {
			if(str.charAt(i) == str.charAt(i+1)){
				count ++;
			}else{
				res.append(count);
				count =1;
				last =str.charAt(i+1);
				res.append(last);
			}
		}
		//REMEMBER THIS STEP BELOW
		res.append(count);
		if(res.toString().length() < str.length()){
			System.out.println(res);
		}else{
			System.out.println(res.toString());
		}
	}
	
	public static void main(String[] args) {
		compressString("aaabbcccd");
	}
}
