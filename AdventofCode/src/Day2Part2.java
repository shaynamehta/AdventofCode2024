import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day2Part2 {

	public static boolean increasing(String[] list) {
		
		int safety = 0; 
		for (int i = 1 ; i < list.length ; i++) {
			
			//check if it doensn't meet requirement
			//if it doesn't, exit right away 
			
			//work with elements in arrays of strings as integers 
			int el1 = Integer.valueOf(list[i]);
			int el0 = Integer.valueOf(list[i-1]);
			
			if (el1 <= el0) {
				
				safety++; // this counts error but also need to check if the report will work without it
			}
			
			else if (el1 - el0 > 3 ) { //if the difference is greater than three
				
				safety++;
				
			}
		}
		
		if (safety > 1) {
			return false;
		}
		//no bad pairs in the loop
		return true;
		
	}
	
	public static boolean decreasing(String[] list) {
			
		int safety2 = 0; 	
		for (int i = 1 ; i < list.length ; i++) {
				
				//check if it doensn't meet requirement
				//if it doesn't, exit right away 
				
				//work with elements in arrays of strings as integers 
				int el1 = Integer.valueOf(list[i]);
				int el0 = Integer.valueOf(list[i-1]);
				
				if (el1 >= el0) {
					
					safety2++;
				}
				
				else if (el1 - el0 < -3 ) { //if the difference is greater than three
					
					safety2++;
					
				}
			}
		
		if (safety2 > 1) {
			return false;
		}	
			return true;
			
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
		

		//start scanning 
		
		File day2 = new File("day2prac");
		try {
			Scanner scan = new Scanner(day2);
			
			int count = 0; 
			
			
			while (scan.hasNext()) {
				//test : System.out.println(scan.nextLine());
				
				//stplit each row
				String line = scan.nextLine(); //grab one whole line
				
				//split the line into a string array 
				String[] elements = line.split(" "); //use split method
				//System.out.println(Arrays.toString(elements)); testing 
				
				if(increasing(elements) || decreasing(elements)) {
					
					count++;
				}
				else {
					System.out.println(Arrays.toString(elements));
				}
			}
			
			System.out.println(count);
			
			//scan each line (6 times) to add to array in array list
			//then move to next index in main array list and refill 
			//repeat 
			
			//scan each line six times
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
