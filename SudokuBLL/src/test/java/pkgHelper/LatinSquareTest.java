package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgHelper.LatinSquare;

public class LatinSquareTest {


	@Test
	public void getLatinSquareTest() {

		int[][] mySquare = {{1,2,3},{3,1,2},{2,3,1}};
		LatinSquare ls = new LatinSquare (mySquare);
		assertTrue(ls.getLatinSquare() == mySquare);
	}
	
	@Test
	public void isLatinSquareTest1() {
		
		int [][] latinSquare = { {1, 2, 3}, {2, 3, 1}, {3, 1, 2}};
		
		LatinSquare lsTrue = new LatinSquare(latinSquare);
		
		assertTrue(lsTrue.isLatinSquare());
		
	}
	
	@Test
	public void isLatinSquareTest6() {
		
		int [][] latinSquare6 = { {1, 2}, {2, 1} };
		
		LatinSquare ls6 = new LatinSquare(latinSquare6);
		
		assertTrue(ls6.isLatinSquare());
		
	}
	
	@Test
	public void isLatinSquareTest2() {
		int [][] latinSquare2 = { {1, 2, 3}, {1, 3, 1}, {3, 1, 2} };
		
		LatinSquare lsDupRow = new LatinSquare(latinSquare2);
		
		assertFalse(lsDupRow.isLatinSquare());
	}
	
	@Test
	public void isLatinSquareTest3() {
		int [][] latinSquare3 = { {1, 2, 3}, {2, 2, 1}, {3, 1, 2} };
		
		LatinSquare lsDupCol = new LatinSquare(latinSquare3);
		
		assertFalse(lsDupCol.isLatinSquare());
		
	}
	
	@Test
	public void isLatinSquareTest4() {
		int [][] latinSquare4 = { {4, 4, 4}, {2, 3, 1}, {3, 1, 2} };
		
		LatinSquare lsDiffRow = new LatinSquare(latinSquare4);

		assertFalse(lsDiffRow.isLatinSquare());
	}
	
	@Test
	public void isLatinSquareTest5() {
		int [][] latinSquare5 = { {4, 2, 3}, {4, 3, 1}, {4, 1, 2} };
		
		LatinSquare lsDiffCol = new LatinSquare(latinSquare5);
		
		assertFalse(lsDiffCol.isLatinSquare());
		
	}
	
	
	@Test
	public void ContainsZeroTest() {
		
		int [][] latinSquare = { {1,2,3}, {2,3,1}, {3,1,2}};
		
		int [][] lS2 = { {1,0,3}, {2,3,1}, {3,1,2}};
		
		LatinSquare ls = new LatinSquare(latinSquare);
		
		assertFalse(ls.ContainsZero(latinSquare));
		
		LatinSquare ls2 = new LatinSquare(lS2);
		
		assertTrue(ls2.ContainsZero(lS2));
		
	}
	
	
	
	@Test
	public void hasDuplicates_test1() {
		
		int [] arr = {1,2,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
		
	}

	@Test
	public void hasDuplicates_test2() {
		
		int [] arr = {1,1,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
		
	}
	@Test
	public void hasDuplicates_test3() {
		
		int [] arr = {1,3,4,5,1};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
	}
	
	@Test
	public void hasDuplicates_test4() {
		
		int [] arr = null;
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
		
	}

	@Test
	public void doesElementExist_Test1() {
		int [] arr = {1,2,3,4,5};
		int iValue = 3;
		
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.doesElementExist(arr, iValue));
		
	}
	
	@Test
	public void doesElementExist_Test2() {
		int [] arr = {1,2,3,4,5};
		int iValue = 99;
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.doesElementExist(arr, iValue));
		
	}
	
	@Test
	public void doesElementExist_test3() {
		
		int [] arr = null;
		int iValue = 1;
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.doesElementExist(arr, iValue));
		
	}
	
	@Test
	public void hasAllValues_Test1() {
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = {3,5,4,2,1};
		
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasAllValues(arr1, arr2));

	}
	
	@Test
	public void hasAllValues_Test2() {
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = null;
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasAllValues(arr1, arr2));

	}
	
	@Test
	public void hasAllValues_Test3() {
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = {1,2,3};
		
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasAllValues(arr1, arr2));

	}
	
	@Test
	public void hasAllValues_Test4() {
		int [] arr1 = null;
		int [] arr2 = {1,2,3,4,5};
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasAllValues(arr1, arr2));

	}

	@Test
	public void getColumnTest() {
		int[][] mySquare = {{1,2,3},{3,1,2},{2,3,1}};
		int[] myColumn1 = {1,3,2};
		int[] myColumn2 = {2,1,3};
		int[] myColumn3 = {3,2,1};
		LatinSquare ls = new LatinSquare(mySquare);
		
		assertTrue(ls.hasAllValues(ls.getColumn(0), myColumn1));
		assertTrue(ls.hasAllValues(ls.getColumn(1), myColumn2));
		assertTrue(ls.hasAllValues(ls.getColumn(2), myColumn3));
		
		
	}

	@Test
	public void getRowTest() {
		int[][] mySquare = {{1,2,3},{3,1,2},{2,3,1}};
		int[] myRow1 = {1,2,3};
		int[] myRow2 = {3,1,2};
		int[] myRow3 = {2,3,1};
		LatinSquare ls = new LatinSquare(mySquare);
		
		assertTrue(ls.hasAllValues(ls.getRow(0), myRow1));
		assertTrue(ls.hasAllValues(ls.getRow(1), myRow2));
		assertTrue(ls.hasAllValues(ls.getRow(2), myRow3));

		
		
	}


}
