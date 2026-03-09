import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Practice {
	private Map<String, LinkedHashMap<String, Integer>> data=new HashMap<String, LinkedHashMap<String,Integer>>();
	
	public void create(String outerKey) {
		data.putIfAbsent(outerKey, new LinkedHashMap<String, Integer>());
	}
	public void put(String outerKey, String innerKey, int val) {
		data.computeIfAbsent(outerKey, k->new LinkedHashMap<>()).put(innerKey, val);
	}
	public static void main(String[] args) {
		
	}
}
