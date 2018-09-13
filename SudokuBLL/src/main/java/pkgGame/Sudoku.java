package pkgGame;

import java.util.Arrays;

public class Sudoku {

	private int [][] puzzle;
	
	
	public int[] errorDestroyer() {
		int[] fillerArray = {0, 9};
		Arrays.sort(fillerArray);
		Arrays.sort(puzzle);
		return fillerArray;
		
	}
}

