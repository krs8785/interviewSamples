package karan.xgeneral;

import java.util.Stack;

public class LongestValidParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		System.out.println(longestValidParentheses(")((()"));

	}
	
	public static int longestValidParentheses(String s) {
		Stack<int[]> stack = new Stack<int[]>();
		int result = 0;
	 
		for(int i=0; i<=s.length()-1; i++){
			char c = s.charAt(i);
			if(c=='('){
				int[] a = {i,0};
				stack.push(a);
			}else{
				if(stack.empty()||stack.peek()[1]==1){
					int[] a = {i,1};
					stack.push(a);
				}else{
					stack.pop();
					int currentLen=0;
					if(stack.empty()){
						currentLen = i+1;
					}else{
						int temp =stack.peek()[0];
						currentLen = i-temp;
					}
					result = Math.max(result, currentLen);
				}
			}
		}
	 
		return result;
	}
}
