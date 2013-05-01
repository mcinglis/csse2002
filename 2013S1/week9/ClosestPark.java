package au.edu.uq.csse2002.week9;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ClosestPark {
	// This is a shoddy way to work with CSV: if you need to work with CSV
	// (or any pre-defined format), use an existing library. This was written
	// only to demonstrate how to use Scanner.

	/** Prints the park closest to the given coordinates. */
	public static void main(String[] args) throws IOException {
		final double latitude = Double.parseDouble(args[0]);
		final double longitude = Double.parseDouble(args[1]);
		Scanner scanner = new Scanner(Paths.get("data", "parks.csv"));
		// Skip header row.
		scanner.nextLine();
		String closestPark = "everything's further than infinity! :O";
		double minDistance = Double.POSITIVE_INFINITY;
		while (scanner.hasNextLine()) {
			String[] row = scanner.nextLine().split(",");
			String parkName = row[2];
			double parkLat = Double.parseDouble(row[7]);
			double parkLon = Double.parseDouble(row[8]);
			double distance = Math.hypot(
					Math.abs(parkLat - latitude),
					Math.abs(parkLon - longitude)
			);
			if (distance < minDistance) {
				minDistance = distance;
				closestPark = parkName;
			}
		}
		System.out.println(closestPark);
		scanner.close();
	}

}
