package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import pkgHelper.LatinSquare;

public class LatinSquareTest {

	@Test
	public void hasDuplicatesTest() {
		
		int [] arr = {1,2,3,4,5};
		LatinSquare ls = new LatinSquare();
		
		assertFalse(ls.hasDuplicates(arr));
		
	}
	
	@Test
	public void ContainsZeroTest() {
		
		int[][] arr = {{1,0,3},{3,1,2},{2,3,1}};
		LatinSquare ls = new LatinSquare();
		
		assertTrue(ls.ContainsZero(arr));
	}
	
	@Test
	public void DoesElementExistTest() {
		
		int[] myArray = {1,2,3,4,5,6};
		int iValue = 4;
		LatinSquare ls = new LatinSquare();
		
		assertTrue(ls.doesElementExist(myArray, iValue));
	}

	@Test
	public void getColumnTest() {
		int[][] mySquare = {{1,2,3},{3,1,2},{2,3,1}};
		int[] myColumn1 = {1,3,2};
		int[] myColumn2 = {2,1,3};
		int[] myColumn3 = {3,2,1};
		LatinSquare ls = new LatinSquare (mySquare);
		
		assertTrue(ls.getColumn(0) == myColumn1);
		assertTrue(ls.getColumn(1) == myColumn2);
		assertTrue(ls.getColumn(2) == myColumn3);
		

		System.out.println(Arrays.toString(ls.getColumn(1)));
		System.out.println(Arrays.toString(ls.getColumn(0)));
		
		
	}
	@Test
	public void getRowTest() {
		int[][] mySquare = {{1,2,3},{3,1,2},{2,3,1}};
		int[] myRow1 = {1,2,3};
		int[] myRow2 = {3,1,2};
		int[] myRow3 = {2,3,1};
		LatinSquare ls = new LatinSquare (mySquare);
		
		assertTrue(ls.getRow(0) == myRow1);
		assertTrue(ls.getRow(1) == myRow2);
		assertTrue(ls.getRow(2) == myRow3);
		
		
	}


}
