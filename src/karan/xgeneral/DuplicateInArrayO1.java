package karan.xgeneral;

public class DuplicateInArrayO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDup(new int[] {1, 2, 3, 1, 3, 6, 6});
	}
	
	public static void printDup(int [] arr){
		 for (int i = 0; i < arr.length; i++)
		  {
			 int tmp0 =Math.abs(arr[i]);
			 int tmp1 =arr[tmp0];
		    if ( tmp1 >= 0){
		    	int tmp20 = Math.abs(arr[i]);
		    	int tmp2 =arr[tmp20];
		      arr[tmp20] = -1 * tmp2;
		    }
		    else{
		      System.out.println(Math.abs(arr[i]));
		    }
		  }
	}

}
