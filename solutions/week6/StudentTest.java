package au.edu.uq.csse2002.week6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTest {

	@Test
	public void letterGrade_AUpper() {
		Student s = new Student(100);
		char grade = s.letterGrade();
		assertEquals('A', grade);
	}

	@Test
	public void letterGrade_ALower() {
		Student s = new Student(93);
		char grade = s.letterGrade();
		assertEquals('A', grade);
	}

	@Test
	public void letterGrade_BUpper() {
		Student s = new Student(92);
		char grade = s.letterGrade();
		assertEquals('B', grade);
	}

	@Test
	public void letterGrade_BLower() {
		Student s = new Student(85);
		char grade = s.letterGrade();
		assertEquals('B', grade);
	}

	@Test
	public void letterGrade_CUpper() {
		Student s = new Student(84);
		char grade = s.letterGrade();
		assertEquals('C', grade);
	}

	/*
	 * So on and so forth: there's a lot of repetition here, and it's probably
	 * fair enough to try to automate it somehow.
	 */
}
