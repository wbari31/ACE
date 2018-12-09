package generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TraineeBatchTest {
	Map<Integer, List<String>> map = new HashMap<>();
	void add(int batch, String studentName){
		if(map.get(batch) == null){
			map.put(batch, new ArrayList<>());
		}
		map.get(batch).add(studentName);
	}
	public static void main(String ...s){
		TraineeBatchTest obj = new TraineeBatchTest();
		obj.add(10012011, "Amit");obj.add(10012011, "sumit");obj.add(10012011, "kapil");
		obj.add(10012012, "Amit2");obj.add(10012012, "sumit2");
		System.out.println(obj.map);
	}

}
