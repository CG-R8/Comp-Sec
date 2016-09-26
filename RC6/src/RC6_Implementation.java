import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Chetan
 *
 */
public class RC6_Implementation {

	private static String token;

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Please enter the 32 bit input\n");
		File file = new File("input.txt");
		Scanner scanner = new Scanner(file);
		while (scanner.hasNext()) {
			token = scanner.next();
			
			if (token.contains("plaintext:")
					&&(!token.contains("\n"))
					)
			{
				System.out.println(token);
			}

		}
		scanner.close();

	}

}
