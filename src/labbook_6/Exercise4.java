package labbook_6;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * school offers medals to the students of tenth based on the following criteria 
 * If(Marks>=90) : Gold 
If(Marks between 80 and 90) : Silver 
If(Marks between 70 and 80) : Bronze 

 *
 */

public class Exercise4 {

	public static HashMap getStudents(HashMap<String, Integer> hmap) {

		HashMap<String, String> hMap = new HashMap<>();

		for (Map.Entry e : hmap.entrySet()) {
			int m = (int) e.getValue();

			if (m > 69 && m < 80) {
				hMap.put((String) e.getKey(), "Bronze Medal");
			} else if (m > 79 && m < 90) {
				hMap.put((String) e.getKey(), "Silver Medal");
			} else {
				if (m > 89 && m < 101) {
					hMap.put((String) e.getKey(), "Gold Medal");
				}
			}
		}

		return hMap;
	}

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("sonu", 76);
		map.put("monu", 83);
		map.put("gonu", 95);
		map.put("ponu", 87);

		System.out.println("Students with Medals: "+getStudents(map));
	}

}
