package labbook_6;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * Create a method which accepts the id and the age of people as a Map and decide if they are eligible for vote. 
 * A person is eligible for vote if his age is greater than 18. Add the IDs of all the eligible persons to list and return the list. 
 *
 */

public class Exercise6 {
	
	public static List<Integer>  votersList(HashMap<Integer, String> hmap) {

		LocalDate curr = LocalDate.now();
		List<Integer> l = new ArrayList<Integer>();

		for(Map.Entry<Integer, String> i: hmap.entrySet()) {
			
			LocalDate dob = LocalDate.parse(i.getValue());
			Period age = Period.between(dob, curr);
			
			if(age.getYears() > 18) {
				l.add(i.getKey());
			}
		}
		return l;
	}

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "1996-01-07");
		map.put(2, "1999-07-01");
		map.put(3, "2003-03-06");
		map.put(4, "2013-02-09");
		
		System.out.println("Eligible for voting: "+votersList(map));

	}

}
