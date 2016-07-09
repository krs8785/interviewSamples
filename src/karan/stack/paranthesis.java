package karan.stack;

import java.util.Stack;

public class paranthesis {

	
static String[] Braces(String[] values) {
        
        
        if(values.length == 0){
            return null;
        }else{
            String[] results = new String[values.length];
            for(int i= 0; i<values.length; i++){
                String para = values[i];
                Stack<Character> mystack = new Stack<Character>();   
                
                for(int j=0;j<para.length();j++){
                    try{
                    	char temp = para.charAt(j);
                                       
	                    if(temp == '{' || temp == '(' || temp == '['){
	                        mystack.push(temp);
	                        
	                    }
	                    
	                    if(temp == ']' || temp == '}' || temp == ')'){
	                    	
	                    	if(mystack.isEmpty()){
	                    		results[i] ="NO";
	                    	}
	                    	char old = mystack.peek();
	                    	if(temp == '}' && old == '{'  || temp == ']' && old == '[' || temp == ')' && old == '('  ){
	                    		mystack.pop();
	                    		 results[i] ="YES";
	                    	}else{
	                    		results[i] = "NO";
	                    		mystack.pop();
	                    	}
	                    }
                    }catch(Exception e){
                    	results[i] ="NO";
                    }
                        
                }
                if(!mystack.isEmpty()){
                	results[i]= "NO";
                }
               
            }

            return results;   
            }
            
        }



    

public static void main(String[] args) {
	String[] temp = Braces(new String[]{"(])","{[{}]))"});
	
	for (int i = 0; i < temp.length; i++) {
		System.out.println(temp[i]);
	}
		
	}
}

