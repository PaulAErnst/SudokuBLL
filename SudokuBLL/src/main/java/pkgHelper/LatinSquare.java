package pkgHelper;

import java.util.Arrays;

public class LatinSquare {

	//Instance Variable(s).
		private int[][] LatinSquare;

	//Basic Constructor.
		public LatinSquare() {
			
		}
		
	//Constructor that sets the square.
		public LatinSquare(int[][] latinSquare) {
			
			super();
			LatinSquare = latinSquare;
		}
		
	//Returns the square.
		public int[][] getLatinSquare() {
			
			return LatinSquare;
		}
		
	//Sets the square.
		public void setLatinSquare(int[][] latinSquare) {
			
			LatinSquare = latinSquare;
		}
	
	//Returns the desired column.	
		public int[] getColumn(int colNumber) {
			
			int[] colReturn = new int[LatinSquare.length];
			for (int iColumn = 0; iColumn < LatinSquare.length ; iColumn++) {
				colReturn[iColumn] = LatinSquare[iColumn][colNumber];
			}
			return colReturn;
		}
		
	//Returns the desired row.
		public int[] getRow(int rowNumber) {
			
			int[] rowReturn = new int[LatinSquare.length];
			for (int iRow = 0; iRow < LatinSquare.length ; iRow++) {
				rowReturn[iRow] = LatinSquare[rowNumber][iRow];
			}
			return rowReturn;
		}
		
		
	//Returns true if the square contains any number of zeroes.
		public boolean ContainsZero(int[][] arr) {
			
			for (int iCol = 0; iCol < arr.length; iCol++) {
				for (int iRow = 0; iRow < arr.length; iRow++) {
					if (arr[iCol][iRow] == 0) {
						return true;
					}
				}
			}
			return false;
		}
	
	//Returns true if the array contains the value in question.
		public boolean doesElementExist(int[] arr, int iValue) {
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == iValue) {
					return true;
				}
			}
			return false;
		}
		
	//Returns true if any two numbers in one row are the same.
		public boolean hasDuplicates(int [] arr) {
			
			boolean hasDuplicates = false;
			if (arr == null) {
				return false;
			}
			
			Arrays.sort(arr);
			
			for (int i = 0; i < arr.length-1; i++) {
				if (arr[i] == arr[i + 1]) {
					hasDuplicates = true;
					break;
				}
			}
			
			return hasDuplicates;
		}
	
	//Returns true if all of the values in the first array are found in the second array.
		public boolean hasAllValues(int[] arr1, int[] arr2) {
			
			int valuesPresentCounter = 0;
			for (int arr2Count = 0; arr2Count < arr2.length; arr2Count++) {
				for (int arr1Count = 0; arr1Count < arr1.length; arr1Count++) {
					if (arr2[arr2Count] == arr1[arr1Count]) {
						valuesPresentCounter++;
					}
				}
				if (valuesPresentCounter == 0) {
					return false;
				}
				valuesPresentCounter = 0;
			}
			return true;
		}
		

	//Returns true if the LatinSquare is in fact a Latin Square: each row and column has no duplicates;
	//each element in the first row is found in every other row; each element is found in every other column.
		public boolean isLatinSquare() {
			
		}
}
