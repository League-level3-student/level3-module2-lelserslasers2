package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import _00_Sorting_Algorithms._00_SortedArrayChecker;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] words = {"oo", "yo", "joe", "sandwich", "mine", "!"};
		String value = "mine";
		
		String[] words2 = {"oi", "yoi", "joei", "sandwichi", "minie", "!i"};
		String value2 = "yoi";
		
		String[] words3 = {"oou", "you", "joeu", "sandwicuh", "mineu", "!u"};
		String value3 = "joeu";
		
		_00_LinearSearch oo = new _00_LinearSearch();
		
		assertEquals(oo.linearSearch(words, value), 4);
		assertEquals(oo.linearSearch(words2, value2), 1);
		assertEquals(oo.linearSearch(words3, value3), 2);
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] words = {0, 1, 3, 4, 5, 6};
		int value = 3;
		
		int[] words2 = {0, 1, 4, 5, 7, 11};
		int value2 = 5;
		
		int[] words3 = {0, 1, 10, 20, 30, 40};
		int value3 = 30;
		
		_01_BinarySearch oo = new _01_BinarySearch();
		
		assertEquals(oo.binarySearch(words, 0, words.length-1, value), 2);
		assertEquals(oo.binarySearch(words2, 0, words2.length-1, value2), 3);
		assertEquals(oo.binarySearch(words3, 0, words3.length-1, value3), 4);
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] words = {0, 1, 2, 3, 4, 5};
		int value = 3;
		
		int[] words2 = {0, 2, 4, 6, 8, 10};
		int value2 = 8;
		
		int[] words3 = {0, 100, 200, 300, 400, 500};
		int value3 = 0;
		
		_02_InterpolationSearch oo = new _02_InterpolationSearch();
		
		assertEquals(oo.interpolationSearch(words, value), 3);
		assertEquals(oo.interpolationSearch(words2, value2), 4);
		assertEquals(oo.interpolationSearch(words3, value3), 0);
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] words = {0, 1, 2, 3, 4, 5};
		int value = 3;
		
		int[] words2 = {0, 2, 4, 6, 8, 11};
		int value2 = 8;
		
		int[] words3 = {0, 100, 200, 350, 400, 500};
		int value3 = 0;
		
		_03_ExponentialSearch oo = new _03_ExponentialSearch();
		assertEquals(oo.exponentialSearch(words, value), 3);
		assertEquals(oo.exponentialSearch(words2, value2), 4);
		assertEquals(oo.exponentialSearch(words3, value3), 0);
	}
}
