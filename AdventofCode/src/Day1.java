import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        // Create lists to store the numbers
        ArrayList<Integer> list1 = new ArrayList<>(); // left column of numbers
        ArrayList<Integer> list2 = new ArrayList<>(); // right column of numbers

        // File containing the numbers
        File day1 = new File("AdventofCodeDay1Data.txt");

        try {
            Scanner scan = new Scanner(day1);

            // Read numbers from the file and add them to the lists
            while (scan.hasNext()) {
                int first = scan.nextInt();
                int second = scan.nextInt();

                list1.add(first);
                list2.add(second);
            }

            // Sort both lists
            Collections.sort(list1);
            Collections.sort(list2);

            // Calculate the total distance between paired elements
            int totalDistance = 0;
            for (int i = 0; i < list1.size(); i++) {
                totalDistance += Math.abs(list1.get(i) - list2.get(i));
            }

            // Output the total distance
            System.out.println("Total distance between the two lists: " + totalDistance);

            // Close the scanner
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file day1.txt was not found.");
        }
    }
}
