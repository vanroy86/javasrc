import java.io.*;
/**
 * Read an int from Standard Input, using 1.5
 * @author	Ian F. Darwin, http://www.darwinsys.com/
 * @version 	$Id$
 */
public class ReadStdinInt15 {
	public static void main(String[] ap) {
		int val;
		try {
			Scanner sc = Scanner.create(System.in);      // Requires J2SE 1.5
			val = sc.nextInt();
		} catch (NumberFormatException ex) {
			System.err.println("Not a valid number: " + line);
			return;
		} catch (IOException e) {
			System.err.println("Unexpected IO ERROR: " + e);
			return;
		}
		System.out.println("I read this number: " + val);
	}
}