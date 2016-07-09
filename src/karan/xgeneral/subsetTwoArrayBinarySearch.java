package karan.xgeneral;

public class subsetTwoArrayBinarySearch {

	public static boolean isSubset(int[] array1, int start, int end ,int x){
		if(start <= end){
			int mid = start + (end - start)/2;
			if(array1[mid] == x){
				return true;
			}else if(array1[mid] < x){
				return isSubset(array1, mid+1, end, x);
			}else{
				return isSubset(array1, 0, mid-1, x);
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {3,5,7,9,22,34};
		int[] array2 = {6,3 ,22 , 9 ,5};
		
		boolean  flag = true;
		for (int i = 0; i < array2.length; i++) {
			if(!isSubset(array1, 0, array1.length - 1, array2[i])){
				flag = false;
				break;
			}
		}
		System.out.println(flag);
		
	}

}
