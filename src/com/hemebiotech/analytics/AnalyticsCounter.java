package com.hemebiotech.analytics;

import java.util.List;

public class AnalyticsCounter {

	public void analyzeFile() {
		
		ISymptomReader readSymptom = new ReadSymptomDataFromFile("Symptoms.txt"); 
		List<String> result = readSymptom.getSymptoms();
/**
 * 
 * We got a list of String called "result" which contains symptoms from the file "Symptoms.txt"
 * 
 */
		SymptomCounter symptomCounter = new SymptomCounter();

		for (String line : result) {

			symptomCounter.countSymptoms(line);				
		}
		symptomCounter.showResult();			
	}	

}
