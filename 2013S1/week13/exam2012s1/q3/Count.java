package exam2012s1.q3;

import java.util.ArrayList;

public class Count {
	/**
	 * @require list != null &&
	 * 			for all x in list, 0 <= x < 100 &&
	 * 			0 <= p <= 100
	 * @ensure \result is the number of elements x in list satisfying x < p
	 */
	public static int count(ArrayList<Integer> list, int p) {
		int c = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < p) {
				c++;
			}
		}
		return c;
	}

	/**
	 * Black box test cases:
	 * 
	 * Boundary values for list: [], [0], [99]
	 * Boundary values for p: 0, 100
	 * 
	 * List boundary with p boundaries, and p non-boundary:
	 * [], 0			=> 0
	 * [], 100			=> 0
	 * [], 34			=> 0
	 * 
	 * List boundary with p boundaries, and p non-boundary:
	 * [0], 0			=> 0
	 * [0], 100			=> 1
	 * [0], 76			=> 1
	 * 
	 * List boundary with p boundaries, and p non-boundary:
	 * [99], 0			=> 0
	 * [99], 100		=> 1
	 * [99], 48			=> 0
	 * 
	 * List non-boundary with p boundaries, and p non-boundary:
	 * [45,56,3], 0		=> 0
	 * [45,56,3], 100	=> 3
	 * [45,56,3], 50	=> 2
	 */

	/**
	 * White box test cases:
	 * 
	 * Loop never:							count([], 50) => 0
	 * Loop once, if() false:				count([45], 30) => 0
	 * Loop once, if() true:				count([50], 70) => 1
	 * Loop twice, if() false then false:	count([32,56], 13) => 0
	 * Loop twice, if() false then true:	count([17,4], 15) => 1
	 * Loop twice, if() true then false:	count([54,97], 68) => 1
	 * Loop twice, if() true then true:		count([34, 39], 98) => 2
	 */
}
