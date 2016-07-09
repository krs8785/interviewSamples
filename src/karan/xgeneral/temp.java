package karan.xgeneral;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class temp {

	/*
	 * Complete the function below.
	 */

	static class model implements Comparable<model>{
		        String name;
		        String ticker;
		        int total;
		        int benchMark;
		        double difference;
		        boolean buy = true;
		        
		        
				@Override
				public int compareTo(model p2) {
					// TODO Auto-generated method stub
					return this.ticker.compareTo(p2.ticker);
				
				}
				public String getName() {
					return name;
				}
		        public void setName(String name) {
					this.name = name;
				}
		        public void setTotal(int total) {
					this.total = total;
				}
		        public int getTotal() {
					return total;
				}
		        public void setTicker(String ticker) {
					this.ticker = ticker;
				}
		        public String getTicker() {
					return ticker;
				}
		        public void setBenchMark(int benchMark) {
					this.benchMark = benchMark;
				}
		        public int getBenchMark() {
					return benchMark;
				}
		        public void setDifference(double difference) {
					this.difference = difference;
				}
		        public double getDifference() {
					return difference;
				}
		        public void setBuy(boolean buy) {
					this.buy = buy;
				}
		        public boolean isBuy() {
					return buy;
				}
		        
		        
		    }


	    static String generateTransactions(String input) {
	                String[] divide = input.split(":");

			        String[] holdings = divide[0].split("\\|");		        
			        String[] benchmark = divide[1].split("\\|");
			        
			        ArrayList<model> allHoldings = new ArrayList<model>();
			        
			        
			        for(int i=0;i<holdings.length;i++){
			            
			            String[] individualHolding = holdings[i].split(",");
			            String[] individualbenchMark = benchmark[i].split(",");
			            model p = new model();
			            p.setTicker(individualHolding[0]);
			            p.setName(individualHolding[1]);
			            p.setTotal(Integer.parseInt(individualHolding[2]));
			            p.setBenchMark(Integer.parseInt(individualbenchMark[2]));
			            p.difference = p.total - p.benchMark;
			            if(p.difference < 0){
			            	p.buy = true;
			            }else{
			            	p.buy = false;
			            }
			            allHoldings.add(p);		            
			        }
			        Collections.sort(allHoldings);
			        
			        
			         
			        ArrayList<String> results = new ArrayList<String>();
			        for(int i=0;i<allHoldings.size();i++){
			        	
			        	model temp = allHoldings.get(i);
	                    double diff = temp.difference;
			        	if( diff != 0){
			        		StringBuffer result = new StringBuffer();
				        	result.append("[");			        	
				        	if(temp.buy){
				        		result.append("BUY,");
				        	}else{
				        		result.append("SELL,");
				        	}
				        	result.append(" "+temp.ticker+",");		
				        	result.append(" "+String.format( "%.2f", Math.abs(temp.difference)));
				        	result.append("]");
				        	results.add(result.toString());
				        	
			        	}
			        }
			        StringBuffer finalRes = new StringBuffer();
			        for (int i = 0; i < results.size(); i++) {
	                    if(i != results.size()-1){
						finalRes.append(results.get(i)+", ");
	                    }else{
	                        finalRes.append(results.get(i));
	                    }
						
					}
			        return  finalRes.toString();
	    }

 public static void main(String[] args) {
		System.out.println(generateTransactions("m,moog,4|g,goog,11|v,vof,4:m,moog,1|g,goog,12|v,vof,4"));
	}
}
