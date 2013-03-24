package au.edu.uq.csse2002.week4;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void fromInt_One() {
		int number = 1;

		String result = RomanNumerals.fromInt(number);

		assertEquals("I", result);
	}

	@Test
	public void fromInt_Two() {
		int number = 2;

		String result = RomanNumerals.fromInt(number);

		assertEquals("II", result);
	}

	@Test
	public void fromInt_Three() {
		int number = 3;

		String result = RomanNumerals.fromInt(number);

		assertEquals("III", result);
	}

	@Test
	public void fromInt_Five() {
		int number = 5;

		String result = RomanNumerals.fromInt(number);

		assertEquals("V", result);
	}

	@Test
	public void fromInt_Eight() {
		int number = 8;

		String result = RomanNumerals.fromInt(number);

		assertEquals("VIII", result);
	}

	@Test
	public void fromInt_Nine() {
		int number = 9;

		String result = RomanNumerals.fromInt(number);

		assertEquals("IX", result);
	}

	@Test
	public void fromInt_Ten() {
		int number = 10;

		String result = RomanNumerals.fromInt(number);

		assertEquals("X", result);
	}

	@Test
	public void fromInt_Seventeen() {
		int number = 17;

		String result = RomanNumerals.fromInt(number);

		assertEquals("XVII", result);
	}

	@Test
	public void fromInt_TwentySix() {
		int number = 26;

		String result = RomanNumerals.fromInt(number);

		assertEquals("XXVI", result);
	}

	@Test
	public void fromInt_FortyNine() {
		int number = 49;

		String result = RomanNumerals.fromInt(number);

		assertEquals("XLIX", result);
	}

	@Test
	public void fromInt_Fifty() {
		int number = 50;

		String result = RomanNumerals.fromInt(number);

		assertEquals("L", result);
	}

	@Test
	public void fromInt_EightyEight() {
		int number = 88;

		String result = RomanNumerals.fromInt(number);

		assertEquals("LXXXVIII", result);
	}

	@Test
	public void fromString_One() {
		String string = "I";

		int result = RomanNumerals.fromString(string);

		assertEquals(1, result);
	}

	@Test
	public void fromString_Two() {
		String string = "II";

		int result = RomanNumerals.fromString(string);

		assertEquals(2, result);
	}

	@Test
	public void fromString_Three() {
		String string = "III";

		int result = RomanNumerals.fromString(string);

		assertEquals(3, result);
	}

	@Test
	public void fromString_Four() {
		String string = "IV";

		int result = RomanNumerals.fromString(string);

		assertEquals(4, result);
	}

	@Test
	public void fromString_Eight() {
		String string = "VIII";

		int result = RomanNumerals.fromString(string);

		assertEquals(8, result);
	}

	@Test
	public void fromString_Nine() {
		String string = "IX";

		int result = RomanNumerals.fromString(string);

		assertEquals(9, result);
	}

	@Test
	public void fromString_Ten() {
		String string = "X";

		int result = RomanNumerals.fromString(string);

		assertEquals(10, result);
	}

	@Test
	public void fromString_Nineteen() {
		String string = "XIX";

		int result = RomanNumerals.fromString(string);

		assertEquals(19, result);
	}

	@Test
	public void fromString_TwentyFour() {
		String string = "XXIV";

		int result = RomanNumerals.fromString(string);

		assertEquals(24, result);
	}

	@Test
	public void fromString_FortyNine() {
		String string = "XLIX";

		int result = RomanNumerals.fromString(string);

		assertEquals(49, result);
	}

	@Test
	public void fromString_Fifty() {
		String string = "L";

		int result = RomanNumerals.fromString(string);

		assertEquals(50, result);
	}
}
