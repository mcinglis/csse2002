package au.edu.uq.csse2002.week7;

import java.util.List;

public class Utility {

	public int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	// public int power(int n, int exponent) {
	// if (exponent == 0) {
	// return 1;
	// }
	// return n * power(n, exponent - 1);
	// }

	public int power(int n, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= n;
		}
		return result;
	}

	public int fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public String reverse(String s) {
		if (s.length() <= 1) {
			return s;
		}
		String reversed = reverse(s.substring(1));
		return reversed + String.valueOf(s.charAt(0));
	}

	public <E> List<E> reverse(List<E> list) {
		if (list.isEmpty()) {
			return list;
		}
		List<E> reversed = reverse(list.subList(1, list.size()));
		reversed.add(list.get(0));
		return reversed;
	}

	public boolean isPalindrome(String s) {
		if (s.length() <= 1) {
			return true;
		}
		boolean headEqTail = s.charAt(0) == s.charAt(s.length() - 1);
		boolean restPalindrome = isPalindrome(s.substring(1, s.length() - 1));
		return headEqTail && restPalindrome;
	}

//	public boolean isPalindrome(String s) {
//		return s.equals(reverse(s));
//	}
}
