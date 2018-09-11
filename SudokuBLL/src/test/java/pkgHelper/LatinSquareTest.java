package pkgHelper;

import static org.junit.Assert.*;

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
}
