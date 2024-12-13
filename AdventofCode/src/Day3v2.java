import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day3v2 { 

	public static void main(String[] args) {

    try {
        // Initialize Scanner to read from the file
    	File day3 = new File("day3.txt");
    	
    	Scanner scan = new Scanner(day3);

        // Regex pattern to match mul(X,Y) where X and Y are integers (1-3 digits)
        Pattern pattern = Pattern.compile("mul\\((\\d{1,3}),\\s*(\\d{1,3})\\)");

        int totalSum = 0;

        // Read each line of the file
        while (scan.hasNextLine()) {
            String line = scan.nextLine(); // Read one full line at a time

            // Create a matcher for the current line
            Matcher matcher = pattern.matcher(line);

            // Process all matches in the current line
            while (matcher.find()) {
                // Extract X and Y values as integers
                int x = Integer.parseInt(matcher.group(1));
                int y = Integer.parseInt(matcher.group(2));

                // Multiply and add to the total sum
                totalSum += x * y;
            }
        }

        // Close the scanner
        scan.close();

        // Output the final sum
        System.out.println(totalSum);

    } catch (FileNotFoundException e) {
        // Handle file not found exception
        System.out.println("The file day3.txt was not found.");
    }
	
	
}

}