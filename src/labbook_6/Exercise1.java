package labbook_6;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 
 * Create a method which accepts a hash map and return the values of the map in sorted order as a List.
 *
 */

public class Exercise1 {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List sortByValue(HashMap<String, Integer> map) {

		List list = new LinkedList(map.entrySet());

		Collections.sort(list, new Comparator() {
			public int compare(Object obj1, Object obj2) {
				return ((Comparable) ((Map.Entry) (obj1)).getValue()).compareTo(((Map.Entry) (obj2)).getValue());
			}
		});
		return list;

	}

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		map.put("A", 42);
		map.put("B", 12);
		map.put("C", 78);

		List<?> list = sortByValue(map);
		System.out.println(list);

	}

}
