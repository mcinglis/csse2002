package au.edu.uq.csse2002.week6;

public class Calendar {

	public enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}

	/**
	 * Returns the day of the week that the given day of the year falls on for
	 * the given year.
	 * 
	 * @param day the day of the year, starting from 1
	 * @param year the year (Gregorian calendar)
	 * @require day >= 1 && day <= 366 && year != 0
	 * @return the day of the week the given date falls on
	 */
	public Day dayOfWeek(int day, int year) {
		assert day >= 1 && day <= 366;
		assert year != 0;
		return Day.MONDAY;
	}

}
