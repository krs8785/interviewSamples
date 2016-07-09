package karan.xgeneral;

public class missingNumberTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {4,6,2,2,0};
		int[] array2 = {6,2,0,2};
		int res =0;
		for (int i = 0; i < array1.length; i++) {
			res = res ^ array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			res = res ^ array2[i];
		}
		System.out.println(res);
		

	}

}
