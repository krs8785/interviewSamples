package karan.DP;

public class minimumCoin {

	
	public static int getMinCoin(int[] coins, int denomination){
		
		int[] total = new int[denomination+1];
		int[] req = new int[denomination+1];
		
		
		for (int i = 1; i < total.length; i++) {
			total[i] = Integer.MAX_VALUE -1;
			req[i] = -1;
		}
		
		total[0] = 0;
		
		for(int j = 0; j < coins.length; j++){
			for(int i = 1; i <= denomination; i++){
				if( i >= coins[j]){
					if(total[i- coins[j]]+1 < total[i]){
						total[i] =total[i- coins[j]]+1 ;
						req[i] = j;
					}
					
				}
			}
		}
		
		return total[denomination];
	}
	
	
	public static void main(String[] args) {
		int [] coins = { 7,3,6,2 };
		int denomination = 13;
		System.out.println(getMinCoin(coins, denomination));
	}
}



