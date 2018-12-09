package generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountManagerTest {
private Map<String, Integer> map = new HashMap<>();

public int getBalance(String accountName){
	//Integer i
	return map.get(accountName)==null?0:map.get(accountName);
}
public void setBalance(String acctNumber, int amount){
	map.put(acctNumber, amount);
}
public static void main(String ...s){
	List<List<Integer>> matrix = new ArrayList<>();
	for(int i=0;i<=10;i++){
		List<Integer> row = new ArrayList<>();
		for(int j=0;j<=10;j++){
			row.add(i*j);
		}
		matrix.add(row);
	}
	for(int i=0;i<matrix.size();i++){
		System.out.println(matrix.get(i));
	}
}
}
