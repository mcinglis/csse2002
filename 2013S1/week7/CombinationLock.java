package au.edu.uq.csse2002.week7;

/** A lock with a two-digit combination. */
public class CombinationLock {

	private String combination;
	private boolean open = true;
	private String entered = "";

	/**
	 * Create a lock with the given two-digit combination; combination values
	 * less than 100 will be given a leading zero.
	 * 
	 * @require 0 <= combination && combination <= 999
	 * @ensure this.isOpen()
	 */
	public CombinationLock(int digit) {
		combination = String.valueOf(digit);
		if (digit < 10) {
			combination = "00" + combination;
		} else if (digit < 100) {
			combination = "0" + combination;
		}
	}

	/**
	 * @return true if this lock is unlocked
	 */
	public boolean isOpen() {
		return open;
	}

	/**
	 * Lock and reset this lock; any partially entered combination is lost.
	 */
	public void close() {
		entered = "";
		open = false;
	}

	/**
	 * Enter a digit of the combination; unlocks if the two digits of the
	 * combination are entered in order.
	 * 
	 * @require 0 <= digit && digit <= 9
	 */
	public void enter(int digit) {
		entered += String.valueOf(digit);
		if (entered.length() == combination.length()) {
			if (entered.equals(combination)) {
				open = true;
			}
			entered = "";
		}
	}

}
