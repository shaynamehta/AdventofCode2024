import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Day3 {

	
	//extract the next multiplication command from the given line
	//returns an empty string if none exists
	public String extractMult(String line) {
		
		if (line.indexOf("mul(") == -1) {
			
			return "";
		} else {
			
			int start = line.indexOf("mul(");
			int end = line.indexOf(")"); //will run into wrong segments 
			
			
			return line.substring(start, end);
			
		}
		
	}	
	
	
	public static void main(String[] args) {
		
		/*
		 * read each row with has next integer
		 * check difference -- next one has to depend on if the difference was 
		 * positive or negative in the first one 
		 * then only if the difference is the same proceed 
		 * also need to check distance is 1 2 or 3
		 * 
		 */
		
		//create array list to hold each array 
		
//		ArrayList<Array> data = new ArrayList<Array>();
		//start scanning 
		
		File day2 = new File("day3.txt");
		try {
			Scanner scan = new Scanner(day2);
			
			 
			
			
			while (scan.hasNext()) {
				//test : System.out.println(scan.nextLine());
				String line = scan.next();
				
				String regex = "mul//((??d+),(//d+)//)";
				
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(line);
				
				List<String>
				
			}
			

			
			//scan each line six times
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
