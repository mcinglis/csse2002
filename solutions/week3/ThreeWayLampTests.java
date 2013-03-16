package au.edu.uq.csse2002.week3.practical;

// This lets us refer to State.OFF or Color.WHITE without having to prefix
// them with ThreeWayLamp. Don't go overboard with this, but since this is
// testing ThreeWayLamp, this is very reasonable to do.
import static au.edu.uq.csse2002.week3.practical.ThreeWayLamp.*;

// You could even do:
//import static au.edu.uq.csse2002.week3.practical.ThreeWayLamp.Color.*;
// And then you could just refer to Color.RED with just RED.
// But that's going overboard IMHO. (but try it out)

public class ThreeWayLampTests {

	public static void main(String[] args) {
		ThreeWayLamp t = new ThreeWayLamp();

		// Remember, add "-ea" to VM Arguments in Run Configurations to
		// get asserts to actually run; 

		assert t.getState() == State.OFF : "Default state isn't OFF";
		assert t.getColor() == Color.WHITE : "Default color isn't WHITE";

		t.setState(State.MEDIUM);
		assert t.getState() == State.MEDIUM : "State isn't set";
		assert t.getColor() == Color.WHITE : "Color is set by state";

		t.setColor(Color.BLUE);
		assert t.getColor() == Color.BLUE : "Color isn't set";
		assert t.getState() == State.MEDIUM : "State is set by color";
	}

}
