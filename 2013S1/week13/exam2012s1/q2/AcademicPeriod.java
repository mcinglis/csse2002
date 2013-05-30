package exam2012s1.q2;

/**
 * An immutable representation of a teaching period, comprised of a year and a
 * semester.
 */
public class AcademicPeriod implements Comparable<AcademicPeriod> {

	private int semester;
	private int year;

	public AcademicPeriod(int semester, int year) {
		// Provided validation
		if (semester != 1 && semester != 2 && semester != 3) {
			throw new IllegalArgumentException();
		}
		this.semester = semester;
		this.year = year;
	}

	public int getSemester() {
		return semester;
	}

	public int getYear() {
		return year;
	}

	public boolean equals(Object o) {
		if (!(o instanceof AcademicPeriod))
			return false;
		AcademicPeriod a = (AcademicPeriod) o;
		return (semester == a.semester && year == a.year);
	}

	// Provided hashCode
	public int hashCode() {
		int result = 17;
		result = (31 * result) + semester;
		result = (31 * result) + year;
		return result;
	}

	public int compareTo(AcademicPeriod a) {
		int result = year - a.year;
		if (result == 0)
			result = semester - a.semester;
		return result;
	}

}