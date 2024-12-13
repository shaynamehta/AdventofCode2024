//import java.io.File;
//import java.io.FileNotFoundException;
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.regex.Pattern;
//


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day3Part2 {


	    public static void main(String[] args) {
	        try {
	            // Initialize Scanner to read from the file
	            File day3 = new File("day3.txt");
	            Scanner scan = new Scanner(day3);

	            // Regex patterns for mul(), do(), and don't() instructions
	            Pattern mulPattern = Pattern.compile("mul\\((\\d{1,3}),\\s*(\\d{1,3})\\)");
	            Pattern doPattern = Pattern.compile("do\\(\\)");
	            Pattern dontPattern = Pattern.compile("don't\\(\\)");

	            int totalSum = 0;
	            boolean isEnabled = true; // Initially, mul instructions are enabled

	            // Read each line of the file
	            while (scan.hasNextLine()) {
	                String line = scan.nextLine(); // Read one full line at a time

	                // Check for all instructions in the line in order
	                Matcher instructionMatcher = Pattern.compile("do\\(\\)|don't\\(\\)|mul\\((\\d{1,3}),\\s*(\\d{1,3})\\)").matcher(line);
	                while (instructionMatcher.find()) {
	                    String instruction = instructionMatcher.group(0);

	                    if (instruction.equals("do()")) {
	                        isEnabled = true;
	                    } else if (instruction.equals("don't()")) {
	                        isEnabled = false;
	                    } else {
	                        Matcher mulMatcher = mulPattern.matcher(instruction);
	                        if (mulMatcher.matches() && isEnabled) {
	                            // Extract X and Y values as integers
	                            int x = Integer.parseInt(mulMatcher.group(1));
	                            int y = Integer.parseInt(mulMatcher.group(2));

	                            // Multiply and add to the total sum
	                            totalSum += x * y;
	                        }
	                    }
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

	
