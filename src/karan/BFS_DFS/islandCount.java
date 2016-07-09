package karan.BFS_DFS;

public class islandCount {

	
	public static int numIslands(char[][] grid) {
	    if (grid==null || grid.length==0 || grid[0].length==0) return 0;
	    int count = 0;
	 
	    for (int i=0; i<grid.length; i++) {
	        for (int j=0; j<grid[0].length; j++) {
	            if(grid[i][j] == '1'){
	                count++;
	                merge(grid, i, j);
	            }
	        }
	    }
	    return count;
	}
	 
	public static void merge(char[][] grid, int i, int j){
	    //validity checking
	    if(i<0 || j<0 || i>grid.length-1 || j>grid[0].length-1)
	        return;
	 
	    //if current cell is water or visited
	    if(grid[i][j] != '1') return;
	 
	    //set visited cell to '0'
	    grid[i][j] = '0';
	 
	    //merge all adjacent land
	    merge(grid, i-1, j);
	    merge(grid, i+1, j);
	    merge(grid, i, j-1);
	    merge(grid, i, j+1);
	    
	    //diagonal
	    merge(grid, i-1, j-1);
	    merge(grid, i-1, j+1);
	    merge(grid, i+1, j-1);
	    merge(grid, i+1, j+1);
	}
	
	public static void main(String[] args) {
		char M[][]=  new char[][] {{'1', '1', '0', '0', '0'},
									{'0', '1', '1', '0', '1'},
							        {'0', '0', '0', '1', '1'},
							        {'0', '0', '0', '0', '0'},
							        {'1', '0', '1', '0', '1'}
							       };
		
		System.out.println(numIslands(M));
	}
}
