package au.edu.uq.csse2002.week3.practical;

public class ModulusCounter {
	private int count = 0;
	private int modulo;

	public ModulusCounter(int modulo) {
		this.modulo = modulo;
	}

	public String toString() {
		return "ModulusCounter(modulo=" + modulo + ", count=" + count + ")";
	}

	public int getCount() {
		return count;
	}

	public void increment() {
		count = (count + 1) % modulo;
	}

}
