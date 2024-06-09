package com.ad;
/**
 * @author Adhyan 
 * date 02/13/2024 
 * A program to read names from a text file, convert them to lowercase, and remove spaces from them.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class NameEqualizer {
	/**
	 * Main method
	 * @param args Command line arguments.
	 * @throws FileNotFoundException if the file "names.txt" is not found
	 */
	public static void main(String[] args) throws FileNotFoundException {

        // Create a Scanner object to read from the input file

		Scanner input = new Scanner(new FileReader("names.txt"));
		
        // Process each line in the input file
		while (input.hasNext()) {
            // Read the next line

			String line = input.nextLine();
            // Convert the line to lowercase

			String lowerCaseLine = line.toLowerCase();
            // Remove all spaces from the lowercase line

			String noSpaceLowerCase = lowerCaseLine.replaceAll(" ", "");
            // Print the processed name
            System.out.println(noSpaceLowerCase);

		}
	}
}
