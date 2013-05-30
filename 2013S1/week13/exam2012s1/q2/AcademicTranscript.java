package exam2012s1.q2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * A mutable data type that, for each academic period, records the courses that
 * were taken by a student in that period and the grade that was received.
 * Courses may be taken more than once in different academic periods, but only
 * once in a given academic period.
 * 
 */
public class AcademicTranscript {

	// maps academic periods to courses taken during
	// that period and their corresponding grades
	private TreeMap<AcademicPeriod, HashMap<String, Integer>> history;

	// maps each course taken to the maximum grade
	// ever received for that course
	private HashMap<String, Integer> maxGrade;

	/** @ensure creates an empty academic transcript */
	public AcademicTranscript() {
		history = new TreeMap<AcademicPeriod, HashMap<String, Integer>>();
		maxGrade = new HashMap<String, Integer>();
	}

	/**
	 * @require the given academic period p is not null and there are currently
	 *          no courses and results recorded for p. Also, results is not null
	 *          and it is non-empty. There are no null courses in results and
	 *          each course is associated with a non-null grade.
	 * @ensure records the courses and grades for academic period p
	 */
	public void addSemesterResults(AcademicPeriod p,
			HashMap<String, Integer> results) {
		history.put(p, results);
		Set<String> courses = results.keySet();
		for (String course : courses) {
			Integer grade = results.get(course);
			Integer max = maxGrade.get(course);
			if ((max != null && grade > max) || max == null) {
				maxGrade.put(course, grade);
			}
		}
	}

	/**
	 * @require course is not null and has been taken in at least one academic
	 *          period
	 * @assume returns the maximum grade received for course
	 */
	public int getMaxGrade(String course) {
		return maxGrade.get(course);
	}

	public String toString() {
		String s = "";
		Set<AcademicPeriod> periods = history.keySet();
		for (AcademicPeriod p : periods) {
			HashMap<String, Integer> results = history.get(p);
			Set<String> courses = results.keySet();
			for (String course : courses) {
				s += course + ": ";
				s += results.get(course) + "\n";
			}
		}
		return s;
	}

	// Provided invariant
	public boolean checkInv() {
		if (history == null || maxGrade == null) {
			return false;
		}

		if (history.containsKey(null) || history.containsValue(null)) {
			return false;
		}

		// No null courses or null grades in any results map
		for (HashMap<String, Integer> results : history.values()) {
			if (results.containsKey(null) || results.containsValue(null)) {
				return false;
			}
		}

		if (maxGrade.containsKey(null) || maxGrade.containsKey(null)) {
			return false;
		}

		// maxGrade holds the maximum grade for every course
		for (Map.Entry<String, Integer> max : maxGrade.entrySet()) {
			for (HashMap<String, Integer> results : history.values()) {
				Integer grade = results.get(max.getKey());
				if (grade != null && grade > max.getValue()) {
					return false;
				}
			}
		}

		return true;
	}
}
