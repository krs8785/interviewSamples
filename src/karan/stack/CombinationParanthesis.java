package karan.stack;

public class CombinationParanthesis {

	public static void  printParanthesis(int left, int right, String current){
		if(right == 0){
			System.out.println(current);
			return;
		}
		if(left > 0){
			printParanthesis(left-1, right, current+"(");
			if(left < right){
				printParanthesis(left, right-1, current+")");
			}
		}else{
			printParanthesis(left, right-1, current+")");
		}
	}
	public static void main(String[] args) {
		printParanthesis(2, 2, "");
	}
	
}
