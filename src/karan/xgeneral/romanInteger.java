package karan.xgeneral;

public class romanInteger {

	public static int romanToInt(String str){
		if(str.length() == 1){
			return getValue(str.charAt(0));
		}
		int len = str.length();
		int value =0;
		int current =0;
		int previous =0;
		char previousChar = str.charAt(0);
		
		for (int i = 1; i < len; i++) {
			previous = getValue(previousChar);
			current = getValue(str.charAt(i));
			
			if(previous >= current){
				value += previous;
			}else{
				value -= previous;
			}
			previousChar = str.charAt(i);
		}
		value += current;
		return value;
	}
	
	private static int getValue(char romainSign) {
	     if (romainSign == 'I') return 1;
	     else if (romainSign == 'V') return 5;
	     else if (romainSign == 'X') return 10;
	     else if (romainSign == 'L') return 50;
	     else if (romainSign == 'C') return 100;
	     else if (romainSign == 'D') return 500;
	     else return 1000;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("XCIV"));

	}

}
