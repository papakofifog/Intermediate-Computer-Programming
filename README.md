# Intermediate-Computer-Programming
Hi gus kofi here
i like food drinks and games

And I'm Ernesto, at least people call me that.





//THE CODE FOR MONITORING CLASS
package classes;

import java.util.List;
import java.util.ArrayList;

public class Monitoring {
	
	public static List<Observatory> observeList = new ArrayList<>();
	
	public Monitoring() {}
	
	public void showObservatories() {
		for(Observatory i: observeList) {
			System.out.print(i);
		}
	}
	
	public int getHighestValue() {
		int max = 0;
		for(Observatory i: observeList) {
			// getColourValue is a method in the Observatory class
			if(i.getHighestColourValue() > max) {
				max = i.getHighestColourValue();
				
			}
				
		}
		
		return max;
	
	}
	public List <Galamsey> valueHigherThan(int value){
		List <Galamsey> allGalamValues = new ArrayList();
		//   Observatory object.
		for (Observatory i: observeList) {
		
			// Galamsey object.
			for (Galamsey j: i.getAllEvents()) {
				allGalamValues.add(j);
			}
		}
		return allGalamValues;
		
	}
	
	public float largestAverage() {
		float max = 0;
		
		for (Observation i: observeList) {
			// AverageColourValue is a methid in the Observatory
		//class
			if(i.getAverageColourValue()>max) {
				max = i.getAverageColourValue();
			// getObservatoryName is
			// a method in the Observatory class.
				name=i.getObservatoryName;
			}
		}
	}
} 






