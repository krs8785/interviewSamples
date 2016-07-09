package karan.xgeneral;

public class matrixRotate {

	private static int[][] matrix = { 
        { 1, 2, 3, 4 }, 
        { 5, 6, 7, 8 }, 
        { 9, 10, 11, 12 }, 
        { 13, 14, 15, 16 } 
    };
    private final static int N = 4;
    
	private static void print() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
	
	public static void rotate(int[][] arr){
		
		
		for(int layer = 0; layer<N/2; layer++){
			int first = layer;
			int last = N - 1 - layer;
			for(int i = first; i < last; i++ ){
				int offset = i - first;
				int top = matrix[first][i];
				matrix[first][i] = matrix[last -offset][first];
				matrix[last -offset][first] = matrix[last][last - offset];
				matrix[last][last -offset] = matrix[first][last];
				matrix[i][last] = top;
			}
		}
		
		print();
	}
	
	public static void main(String[] args) {
	
		print();
		rotate(matrix);
	}
}
