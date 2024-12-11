import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1 {

public static void main(String[] args) {
	
	//put both lists into array 	
	
	ArrayList<Integer> list1 = new ArrayList<Integer>(); //left column of numbers
	ArrayList<Integer> list2 = new ArrayList<Integer>(); //right column of numbers
	
	File day1 = new File("AdventofCodeDay1Data.txt");
	
		
		try {
			Scanner scan = new Scanner(day1);
			
			
			while (scan.hasNext()) {
				
				//read two integers per iteration (one per list)
				int first = scan.nextInt();
				int second = scan.nextInt();						
	
				//add 2 numbers to their respective lists 
				
				list1.add(first);
				list2.add(second);
				
			}
			
			//test 
			
			
			while (list1.size() > 0) {
			//now look for something smaller than current smallest
				
				int smallest = list1.get(0);
				int smallestIndex = 0;
				
				for (int i = 0 ; i < list1.size() ; i++) {
					
					if (list1.get(i) < smallest) {
						
						smallest 		= list1.get(i);
						smallestIndex 	= i;
					}
				}
				
				//remove the smallest value you found
				
				list1.remove(smallestIndex); // so next loop doesn't have it anymore
			}	
			
			
			
			int smallest2 = list2.get(0);
			int smallestIndex2 = 0; 
			
			while (list2.size() > 0) {
				//now look for something smaller than current smallest
					
					for (int i = 0 ; i < list2.size() ; i++) {
						
						if (list2.get(i) < smallest2) {
							
							smallest2 		= list2.get(i);
							smallestIndex2 	= i;
						}
					}
					
					//remove the smallest value you found
					
					list2.remove(smallestIndex2); // so next loop doesn't have it anymore
				}	
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}	


//reorder both lists from smallest to largest 
	
	
}
