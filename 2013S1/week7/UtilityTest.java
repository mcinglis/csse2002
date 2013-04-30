package au.edu.uq.csse2002.week7;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class UtilityTest {

	Random random = new Random();
	Utility utility;

	@Before
	public void setUp() throws Exception {
		utility = new Utility();
	}

	@Test
	public void factorial_Zero() {
		int n = 0;
		int result = utility.factorial(n);
		assertEquals(1, result);
	}

	@Test
	public void factorial_One() {
		int n = 1;
		int result = utility.factorial(n);
		assertEquals(1, result);
	}

	@Test
	public void factorial_Two() {
		int n = 2;
		int result = utility.factorial(n);
		assertEquals(2, result);
	}

	@Test
	public void factorial_Five() {
		int n = 5;
		int result = utility.factorial(n);
		assertEquals(120, result);
	}

	@Test
	public void factorial_Ten() {
		int n = 10;
		int result = utility.factorial(n);
		assertEquals(3628800, result);
	}

	@Test
	public void fibonacci_Zero() {
		int n = 0;
		int result = utility.fibonacci(n);
		assertEquals(0, result);
	}

	@Test
	public void fibonacci_One() {
		int n = 1;
		int result = utility.fibonacci(n);
		assertEquals(1, result);
	}

	@Test
	public void fibonacci_Two() {
		int n = 2;
		int result = utility.fibonacci(n);
		assertEquals(1, result);
	}

	@Test
	public void fibonacci_Three() {
		int n = 3;
		int result = utility.fibonacci(n);
		assertEquals(2, result);
	}

	@Test
	public void fibonacci_Ten() {
		int n = 10;
		int result = utility.fibonacci(n);
		assertEquals(55, result);
	}

	@Test
	public void power_ExponentIsZero() {
		int n = random.nextInt();
		int exponent = 0;

		int result = utility.power(n, exponent);

		assertEquals(1, result);
	}

	@Test
	public void power_ExponentIsOne() {
		int n = random.nextInt();
		int exponent = 1;

		int result = utility.power(n, exponent);

		assertEquals(n, result);
	}

	@Test
	public void power_ExponentIsTwo() {
		int n = random.nextInt();
		int exponent = 2;

		int result = utility.power(n, exponent);

		assertEquals(n * n, result);
	}

	@Test
	public void power_ExponentIsThree() {
		int n = random.nextInt();
		int exponent = 3;

		int result = utility.power(n, exponent);

		assertEquals(n * n * n, result);
	}

	@Test
	public void power_ExponentIsLarge() {
		int n = random.nextInt();
		int exponent = 10000;
		utility.power(n, exponent);
	}

	@Test
	public void palindrome_Empty() {
		String s = "";
		boolean result = utility.isPalindrome(s);
		assertTrue(result);
	}

	@Test
	public void palindrome_Single() {
		String s = "a";
		boolean result = utility.isPalindrome(s);
		assertTrue(result);
	}

	@Test
	public void palindrome_OddLengthTrue() {
		String s = "radar";
		boolean result = utility.isPalindrome(s);
		assertTrue(result);
	}

	@Test
	public void palindrome_OddLengthFalse() {
		String s = "apple";
		boolean result = utility.isPalindrome(s);
		assertFalse(result);
	}

	@Test
	public void palindrome_ReallyLongDoesntFail() {
		StringBuilder s = new StringBuilder("radar");
		for (int i = 0; i < 10000; i++) {
			s.append("radar");
		}
		utility.isPalindrome(s.toString());
	}

	@Test
	public void reverse_String_Empty() {
		String s = "";
		String result = utility.reverse(s);
		assertEquals("", result);
	}

	@Test
	public void reverse_String_Single() {
		String s = "a";
		String result = utility.reverse(s);
		assertEquals("a", result);
	}

	@Test
	public void reverse_String_Two() {
		String s = "ab";
		String result = utility.reverse(s);
		assertEquals("ba", result);
	}

	@Test
	public void reverse_String_Long() {
		String s = "hello, world";
		String result = utility.reverse(s);
		assertEquals("dlrow ,olleh", result);
	}

	@Test
	public void reverse_List_Empty() {
		List<Integer> list = new LinkedList<>();
		List<Integer> result = utility.reverse(list);
		assertTrue(result.isEmpty());
	}

	@Test
	public void reverse_List_One() {
		List<Integer> list = new LinkedList<>(Arrays.asList(5));
		List<Integer> result = utility.reverse(list);
		assertEquals(Arrays.asList(5), result);
	}

	@Test
	public void reverse_List_Two() {
		List<Integer> list = new LinkedList<>(Arrays.asList(5, 8));
		List<Integer> result = utility.reverse(list);
		assertEquals(Arrays.asList(8, 5), result);
	}

	@Test
	public void reverse_List_Long() {
		List<Integer> list = new LinkedList<>(Arrays.asList(1, 4, -8, 3, 7, 2));
		List<Integer> result = utility.reverse(list);
		assertEquals(Arrays.asList(2, 7, 3, -8, 4, 1), result);
	}

}
