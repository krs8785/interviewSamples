package karan.xgeneral;

public class adjacentDigit {

	public static void main(String[] args) {
		
		
		String  num = "3425";
		
		int minValue = Integer.MAX_VALUE;
		int j=0;
		StringBuffer res;
		for(int i=1;i<num.length();i++){
			res = new StringBuffer();
			int first = Integer.parseInt(""+num.charAt(j));

			int second = Integer.parseInt(""+num.charAt(i));
			System.out.println("->"+first+"+"+second);
			int larger = -1;
			if(first > second){
				larger = first;
			}else{
				larger = second;
			}
			res.append(num.substring(0,j));
			
			res.append(""+larger);
			res.append(num.substring(i+1,num.length()));
			System.out.println(res);
			int fin_res = Integer.parseInt(res.toString());
			if(fin_res < minValue){
				 minValue = fin_res;
			}
			
			
			j++;
		}
		System.out.println("finalREsult ----"+minValue);
	}
}
