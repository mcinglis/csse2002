package au.edu.uq.csse2002.week7;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CombinationLockTest {

	@Test
	public void isOpen_NewLock() {
		CombinationLock lock = new CombinationLock(123);
		boolean result = lock.isOpen();
		assertTrue(result);
	}

	@Test
	public void isOpen_AfterClose() {
		CombinationLock lock = new CombinationLock(123);

		lock.close();
		boolean result = lock.isOpen();

		assertFalse(result);
	}

	@Test
	public void enter_Correct_OpenAtEnd() {
		// Given a new lock
		CombinationLock lock = new CombinationLock(123);
		
		assertTrue(lock.isOpen());
		lock.enter(1);
		assertTrue(lock.isOpen());
		lock.enter(2);
		assertTrue(lock.isOpen());
		lock.enter(3);
		assertTrue(lock.isOpen());
	}

	@Test
	public void enter_CloseThenCorrect_OnlyOpenAtEnd() {
		// Given a new lock
		CombinationLock lock = new CombinationLock(123);

		lock.close();

		assertFalse(lock.isOpen());
		lock.enter(1);
		assertFalse(lock.isOpen());
		lock.enter(2);
		assertFalse(lock.isOpen());
		lock.enter(3);
		assertTrue(lock.isOpen());
	}

	@Test
	public void enter_Incorrect_OpenAtEnd() {
		// Given a new lock
		CombinationLock lock = new CombinationLock(123);

		assertTrue(lock.isOpen());
		lock.enter(1);
		assertTrue(lock.isOpen());
		lock.enter(2);
		assertTrue(lock.isOpen());
		lock.enter(4);
		assertTrue(lock.isOpen());
	}

	@Test
	public void enter_CloseThenIncorrect_AlwaysClosed() {
		// Given a new lock
		CombinationLock lock = new CombinationLock(123);

		lock.close();

		assertFalse(lock.isOpen());
		lock.enter(1);
		assertFalse(lock.isOpen());
		lock.enter(2);
		assertFalse(lock.isOpen());
		lock.enter(4);
		assertFalse(lock.isOpen());
	}

	@Test
	public void newLock_PadsCombinationWithZeroes() {
		CombinationLock lock = new CombinationLock(50);
		lock.close();

		lock.enter(0);
		lock.enter(5);
		lock.enter(0);

		assertTrue(lock.isOpen());
	}
}
