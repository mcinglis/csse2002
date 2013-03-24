package au.edu.uq.csse2002.week4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RomanNumerals {

	/*
	 * There's repetition in logic, here (which will become more evident by
	 * adding the higher numerals). You could try to combine the logic for
	 * building the mapping with the numeralToInt method used for parsing.
	 */

	private static final Map<Integer, String> numerals = new LinkedHashMap<>();
	static {
		numerals.put(50, "L");
		numerals.put(40, "XL");
		numerals.put(10, "X");
		numerals.put(9, "IX");
		numerals.put(5, "V");
		numerals.put(1, "I");
	}

	// Approach to generating from Jim Weirich's kata:
	// http://www.youtube.com/watch?v=983zk0eqYLY

	public static String fromInt(int number) {
		String result = "";
		for (Entry<Integer, String> numeral : numerals.entrySet()) {
			while (number >= numeral.getKey()) {
				result += numeral.getValue();
				number -= numeral.getKey();
			}
		}
		return result;
	}

	// Approach to parsing from:
	// http://blog.functionalfun.net/2009/01/project-euler-89-converting-to-and-from.html

	public static int fromString(String string) {
		int[] xs = reversedNumeralsToInts(string.toCharArray());
		int max = 0, total = 0;
		for (int x : xs) {
			if (x >= max) {
				total += x;
				max = x;
			} else {
				total -= x;
			}
		}
		return total;
	}

	private static int[] reversedNumeralsToInts(char[] chars) {
		int[] ints = new int[chars.length];
		for (int i = 0; i < chars.length; i++) {
			ints[ints.length - i - 1] = numeralToInt(chars[i]);
		}
		return ints;
	}

	// This should probably be a mapping too, actually.
	private static int numeralToInt(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		default:
			return -1;
		}
	}

}
