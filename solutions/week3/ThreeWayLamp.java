package au.edu.uq.csse2002.week3.practical;

/**
 * A lamp with four possible settings: OFF, LOW, MED, and HIGH.
 * 
 * @author Malcolm Inglis
 */
public class ThreeWayLamp {

	// http://docs.oracle.com/javase/tutorial/java/javaOO/enum.html

	// You can think of enum types as just classes whose objects are
	// pre-defined and pre-allocated. Enum types can't have any objects
	// beyond whatever objects were defined in the body.

	// Note: "State" is pretty cryptic, here. But, I noticed that renaming
	// this enum type to something like "Luminosity" gave way to a much
	// larger refactoring, so lets just make do with this.

	// Think: why would we define these enums with the "static" keyword?

	/** A possible state of a three-way lamp. */
	public static enum State {
		OFF(0), LOW(33), MEDIUM(67), HIGH(100);

		// Note: external users of the Lamp class won't be able to access
		// this field of State objects, because it's package-private.
		// Although, the ThreeWayLamp class can access this field directly
		// because State is defined inside of the class.
		int luminosity;

		State(int luminosity) {
			this.luminosity = luminosity;
		}
	}

	// Note: you should use American English when programming.
	// (I like to use it anyway because it's generally more phonetic :) )

	/** A color that may be emitted by a three-way lamp. */
	public static enum Color {
		WHITE(255, 255, 255),
		RED(255, 0, 0),
		GREEN(0, 255, 0),
		BLUE(0, 0, 255);

		int r, g, b;

		Color(int red, int green, int blue) {
			r = red;
			g = green;
			b = blue;
		}
	}

	// Imagine how hard defining both of these properties - State and Color -
	// would be if we had stuck with "public static final int" fields.
	// (and how hard it would be to validate any given values - with enums,
	// the Java compiler checks values for us).

	private State state;
	private Color color;

	/** Creates a lamp that is turned off, and set to white light. */
	public ThreeWayLamp() {
		state = State.OFF;
		color = Color.WHITE;
	}

	/**
	 * @return the current state of the lamp
	 */
	public State getState() {
		return state;
	}

	/**
	 * @param state
	 *            the new state of the lamp
	 */
	public void setState(State state) {
		this.state = state;
	}

	// Thanks to the type safety of Enums, by saying that setState only
	// takes things of type "State", we're ensured that Java will only ever
	// compile programs that pass it OFF, LOW, MEDIUM, or HIGH.

	/**
	 * @return the configured color of the lamp
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color
	 *            the new color of the lamp
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	// Now, the Lamp class can work with state.luminosity and color.red,
	// color.blue and color.green to, e.g., power the LEDS.

	// Exercise: implement "cycleState" and "cycleColor" methods that 
	// set the state or color to the next successive value, so:
	// OFF -> LOW -> MEDIUM -> HIGH,
	// and WHITE -> RED -> GREEN -> BLUE.

}