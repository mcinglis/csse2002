package au.edu.uq.csse2002.week2.tutorial;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import au.edu.uq.csse2002.week2.tutorial.Utility;

public class UtilityTests {

	Utility utility;

	@Before
	public void setUp() {
		utility = Utility.INSTANCE;
	}

	@Test
	public void sum_Empty() {
		int[] empty = {};

		int result = utility.sum(empty);

		assertEquals(result, 0);
	}

	@Test
	public void sum_Singleton() {
		int[] single = { 5 };

		int result = utility.sum(single);

		assertEquals(result, 5);
	}

	@Test
	public void sum_Complex() {
		int[] many = { 3, 5, 8, -3, -17 };

		int result = utility.sum(many);

		assertEquals(result, -4);
	}

	@Test
	public void countItem_Empty() {
		int item = 42;
		int[] empty = {};

		int result = utility.countItem(item, empty);

		assertEquals(result, 0);
	}

	@Test
	public void countItem_NoOccurrences() {
		int item = -5;
		int[] array = { 5, 8, 27 };

		int result = utility.countItem(item, array);

		assertEquals(result, 0);
	}

	@Test
	public void countItem_OneOccurence() {
		int item = 7;
		int[] array = { 8, 3, 5, 8, 7 };

		int result = utility.countItem(item, array);

		assertEquals(result, 1);
	}

	@Test
	public void countItem_ManyOccurences() {
		int item = 3;
		int[] array = { 0, 2, 3, 98, 25, 3, 33, 333, 3, -3 };

		int result = utility.countItem(item, array);

		assertEquals(result, 3);
	}

	@Test
	public void sumArray_BothEmpty() {
		int[] a = {}, b = {}, c = {};

		utility.sumArray(a, b, c);

		int[] expected = {};
		assertArrayEquals(c, expected);
	}

	@Test
	public void sumArray_OneEmpty() {
		int[] a = {}, b = { 1, 2 }, c = {};

		utility.sumArray(a, b, c);

		int[] expected = {};
		assertArrayEquals(c, expected);
	}

	@Test
	public void sumArray_Singletons() {
		int[] a = { 4 }, b = { -5 }, c = new int[1];

		utility.sumArray(a, b, c);

		int[] expected = { -1 };
		assertArrayEquals(c, expected);
	}

	@Test
	public void sumArray_Complex() {
		int[] a = { 4, 5, 3, -2, 7 }, b = { -4, 6, 0, -1, -9 }, c = new int[5];

		utility.sumArray(a, b, c);

		int[] expected = { 0, 11, 3, -3, -2 };
		assertArrayEquals(c, expected);
	}

	@Test
	public void sumArray_BothLongerThanResultArray() {
		int[] a = { 4, 5, 3, -2, 7 }, b = { -4, 6, 0, -1, -9, 98 }, c = new int[3];

		utility.sumArray(a, b, c);

		int[] expected = { 0, 11, 3 };
		assertArrayEquals(c, expected);
	}

	@Test
	public void isUniqueChars_Empty() {
		String string = "";

		boolean result = utility.isUniqueChars(string);

		assertTrue(result);
	}

	@Test
	public void isUniqueChars_Singleton() {
		String string = "a";

		boolean result = utility.isUniqueChars(string);

		assertTrue(result);
	}

	@Test
	public void isUniqueChars_Unique() {
		String string = "abiuzmwhelpq";

		boolean result = utility.isUniqueChars(string);

		assertTrue(result);
	}

	@Test
	public void isUniqueChars_NonUnique() {
		String string = "this isn't a unique string!";

		boolean result = utility.isUniqueChars(string);

		assertFalse(result);
	}

	@Test
	public void isUniqueChars_UniqueUnicode() {
		String string = "你好，世界。这是一个美妙的地方！";

		boolean result = utility.isUniqueChars(string);

		assertTrue(result);
	}

	@Test
	public void isUniqueChars_NonUniqueUnicode() {
		String string = "你好，世界。这是一个美妙的地方！你好，世界。";

		boolean result = utility.isUniqueChars(string);

		assertFalse(result);
	}

	@Test
	public void removeDuplicates_Empty() {
		char[] chars = {};

		utility.removeDuplicates(chars);

		char[] expected = {};
		assertArrayEquals(expected, chars);
	}

	@Test
	public void removeDuplicates_Singleton() {
		char[] chars = { 'a' };

		utility.removeDuplicates(chars);

		char[] expected = { 'a' };
		assertArrayEquals(expected, chars);
	}

	@Test
	public void removeDuplicates_NoDuplicates() {
		char[] chars = { 'a', 'x', 'f' };

		utility.removeDuplicates(chars);

		char[] expected = { 'a', 'x', 'f' };
		assertArrayEquals(expected, chars);
	}

	@Test
	public void removeDuplicates_Duplicates() {
		char[] chars = { 'a', 'x', 'f', 'e', 'x', 'g', 'a', 'a' };

		utility.removeDuplicates(chars);

		char[] expected = { 'a', 'x', 'f', 'e', 'g', 0, 0, 0 };
		assertArrayEquals(expected, chars);
	}

	@Test
	public void removeDuplicates_NoDuplicatesUnicode() {
		char[] chars = { '你', '好', '世', '界' };

		utility.removeDuplicates(chars);

		char[] expected = { '你', '好', '世', '界' };
		assertArrayEquals(expected, chars);
	}

	@Test
	public void removeDuplicates_DuplicatesUnicode() {
		char[] chars = { '界', '你', '好', '界', '好', '世', '世' };

		utility.removeDuplicates(chars);

		char[] expected = { '界', '你', '好', '世', 0, 0, 0 };
		assertArrayEquals(expected, chars);
	}

	@Test
	public void areAnagrams_Empty() {
		String s1 = "", s2 = "";

		boolean result = utility.areAnagrams(s1, s2);

		assertTrue(result);
	}

	@Test
	public void areAnagrams_Anagrams() {
		String s1 = "deductions", s2 = "discounted";

		boolean result = utility.areAnagrams(s1, s2);

		assertTrue(result);
	}

	@Test
	public void areAnagrams_NotAnagrams() {
		String s1 = "discriminator", s2 = "dostrinairism";

		boolean result = utility.areAnagrams(s1, s2);

		assertFalse(result);
	}

	@Test
	public void areAnagrams_AnagramsUnicode() {
		String s1 = "的地美妙的地方", s2 = "的方妙的美地地";

		boolean result = utility.areAnagrams(s1, s2);

		assertTrue(result);
	}

	@Test
	public void areAnagrams_NotAnagramsUnicode() {
		String s1 = "的美妙的地方", s2 = "的的方个美地";

		boolean result = utility.areAnagrams(s1, s2);

		assertFalse(result);
	}

}
