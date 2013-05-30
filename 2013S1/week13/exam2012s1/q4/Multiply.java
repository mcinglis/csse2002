package exam2012s1.q4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Multiply {
	/**
	 * Without modifying list, returns an array \result of integers of the same
	 * size as list such that for each index i of \result, \result.get(i) is the
	 * product of the first i+1 elements of list.
	 * 
	 * @require list != null
	 * @ensure list == \old(list) &&
	 * 			\result.size() == list.size() &&
	 * 			for each index i satisfying 0 <= i < \result.size(),
	 * 				\result.get(i) is the product of the first i+1 elements of
	 * 				list
	 */
	public static ArrayList<Integer> multiply(ArrayList<Integer> list) {
		ArrayList<Integer> products = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			// Loop invariant: for all 0 < j < i, products.get(j) is the product
			// of the first j+1 elements of list.
			int product;
			if (i == 0) {
				product = list.get(i);
			} else {
				product = products.get(i - 1) * list.get(i);
			}
			products.add(product);
		}
		// Partial correctness: loop exits when i >= list.size(), hence for all
		// 0 < j < list.size(), products.get(j) is the product of the first
		// j+1 elements of the list.
		// Total correctness: i starts at 0 and increments, hence it will
		// eventually be equal to list.size() (list is not changed)
		return products;
	}



	public static ArrayList<Integer> multiplyRecursive(ArrayList<Integer> list) {
		ArrayList<Integer> products = new ArrayList<Integer>();
		populateProducts(products, list, 0);
		return products;
	}

	private static void populateProducts(List<Integer> products,
			List<Integer> list, int i) {
		if (i >= list.size()) {
			return;
		} else if (i == 0) {
			products.add(list.get(0));
		} else {
			int product = products.get(i - 1) * list.get(i);
			products.add(product);
		}
		populateProducts(products, list, i + 1);
	}

	public static void main(String[] args) {
		ArrayList<Integer> xs = new ArrayList<>(Arrays.asList(5,3,2,9));
		System.out.println(multiplyRecursive((ArrayList<Integer>) xs));
	}
}
