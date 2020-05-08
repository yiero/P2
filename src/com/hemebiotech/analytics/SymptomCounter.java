package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;
/**
 * This class will sort and count symptoms , and write them on a file 
 * @author Admin
 *
 */
public class SymptomCounter {

	TreeMap<String, Integer> sort = new TreeMap<>();

	/**
	 * We are using a TreeMap to sort symptoms
	 * 
	 * @param line is the name of symptoms
	 * he is used for parameter in the method countSymptoms
	 */
	public void countSymptoms (String line) {

		Integer newValue = 0;
		Integer actualValue = sort.get(line);

		if (actualValue == null) {
			newValue++;
		} else {
			newValue = actualValue +1;
		}

		sort.put(line, newValue);
	} 
	/**
	 * Show us all symptoms sorted alphabetically with the order of occurrence in an file who will created at runtime of the program 
	 * We are using two try/catch, for create the file and close him
	 */
	public void showResult() {
		FileWriter writer = null;
		try {
			writer =  new FileWriter ("result.out");
			writer.write(sort.toString());	
		} catch (Exception e) { 
			e.printStackTrace();
		} finally { 
			
				try {
					if (writer != null) {
						writer.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}		
	}
}
