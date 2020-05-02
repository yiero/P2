package com.hemebiotech.analytics;

import java.util.List;
/**
 * We convert results in the file "Symptoms.txt", in the List of String 
 * @author Admin
 *
 */
public class AnalyticsCounter {

	public void analyzeFile() {
		
		ISymptomReader readSymptom = new ReadSymptomDataFromFile("Symptoms.txt"); 
		List<String> symptoms = readSymptom.getSymptoms();
/**
 * 
 * We got a list of String which contains symptoms from the file "Symptoms.txt"
 * 
 */
		SymptomCounter symptomCounter = new SymptomCounter();

		for (String symptom : symptoms) {

			symptomCounter.countSymptoms(symptom);				
		}
		symptomCounter.showResult();			
	}	

}
