package au.edu.uq.csse2002.week3.tutorial;

import java.util.Date;
import java.util.List;

// NOTE: the comments I've written in this file are PURELY for demonstration
// purposes. You shouldn't write comments like this in your code.

// With this, a Board class might have a List<Flight> field to display
// each flight.

public class Flight {

	// It's common to list final fields first, but I arranged them according
	// to how I could best describe my reasoning :)

	// Many departure boards list the original time and the delayed time.
	// (note: the java.util.Date class represents date and time)
	private final Date originalTime;
	private Date currentTime;

	// I give these fields their own types, because they'll likely be given
	// enough responsibilities. They also intuitively represent objects.
	private Airport destination;
	private Gate gate;
	// We'd like to represent tag sharing on our board, so we have a list.
	private List<Airline> airlines;

	// These fields will benefit from the flexibility of just being Strings,
	// and they're very closely related to the concept of a "flight" anyway.
	private final String code;
	private String status;

	// like setDestination, you would want to copy airlines, and not just
	// assign it (because you'd assign a reference), otherwise, the caller
	// of the constructor could modify the list without us knowing.
	// Likewise for time, because Date objects are mutable. If Airport or Gate
	// objects are mutable, you would want to copy them, too.
	public Flight(List<Airline> airlines, Airport destination, Date time,
			Gate gate, String code) {}

	// This would always return currentTime, which we assume is assigned from
	// the time variable in the constructor (as is originalTime).
	public Date getTime() {}
	// This would always write to currentTime.
	public void setTime(Date time) {}

	public Airport getDestination() {}
	// AFAIK, it's possible for flights to change their airport at late notice
	public void setDestination() {}

	public Gate getGate() {}
	public void setGate(Gate gate) {}

	// getAirlines should return a copy, not a reference, so that callers
	// can't modify the list underneath us.
	public List<Airline> getAirlines() {}
	public void removeAirline(Airline airline) {}
	public void addAirline(Airline airline) {}

	// Perhaps the one thing about a flight that won't change is the code?
	public String getCode() {}

	public String getStatus() {}
	public void setStatus(String status) {}
}
