package au.edu.uq.csse2002.week9;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class SuburbPlaygrounds {
	// This is a shoddy way to work with CSV: if you need to work with CSV
	// (or any pre-defined format), use an existing library. This was written
	// only to demonstrate how to use Scanner.

	/** Prints all the playgrounds in the suburb specified by `args[0]`. */
	public static void main(String[] args) throws IOException {
		String suburb = args[0];
		Scanner scanner = new Scanner(Paths.get("data", "playgrounds.csv"));
		// skip header row
		scanner.nextLine();
		while (scanner.hasNextLine()) {
			String[] row = scanner.nextLine().split(",");
			String playgroundSuburb = row[4];
			String playgroundName = row[6];
			double playgroundLatitude = Double.parseDouble(row[8]);
			if (playgroundSuburb.equalsIgnoreCase(suburb)) {
				System.out.println(playgroundName);
				System.out.println(playgroundLatitude);
			}
		}
		scanner.close();
	}

}
