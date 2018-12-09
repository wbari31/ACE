package generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class EntryComparator implements Comparator<Map.Entry<String, String>>{

	@Override
	public int compare(Entry<String, String> arg0, Entry<String, String> arg1) {
		return arg0.getValue().compareTo(arg1.getValue());
	}
	
}

public class ValueBasedSortingDemo {
	public static void main(String ...s){
		Map<String, String> map = new HashMap<>();
		map.put("1", "one");
		map.put("2", "two");
		map.put("3", "three");
		map.put("4", "four");
		map.put("5", "five");
		System.out.println(map);
		
		map = sort(map);
		System.out.println(map);
	}

	private static Map<String, String> sort(Map<String, String> map) {
		List<Map.Entry<String, String>> entryList = new ArrayList<>();
		for(Map.Entry<String, String> entry : map.entrySet()){
			entryList.add(entry);
		}
		Collections.sort(entryList,new EntryComparator());
		Map<String, String> sortedMap = new LinkedHashMap<>();
		for(Map.Entry<String, String> entry : entryList){
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortedMap;
	}

}
