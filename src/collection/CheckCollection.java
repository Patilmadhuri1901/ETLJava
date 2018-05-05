package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CheckCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckCollection objCollection = new CheckCollection();
		System.out.println(objCollection.getArrayListCollection());
		System.out.println(objCollection.getHashSetCollection());
		System.out.println(objCollection.getHashMapCollection());
	}
	
	public List<String> getArrayListCollection(){
		List<String> arr = new ArrayList<String>();
		arr.add("Nilesh");
		arr.add("Rohit");
		arr.add("Nilesh");
		return arr;
	}
	
	public Set<String> getHashSetCollection(){
		Set<String> arr = new HashSet<String>();
		arr.add("Nilesh");
		arr.add("Rohit");
		arr.add("Nilesh");
		arr.add("Rohit");
		arr.add("Sachin");
		return arr;
	}
	
	public Map<String, String> getHashMapCollection(){
		Map<String, String> arrMap = new HashMap<String, String>();
		arrMap.put("Name", "Nilesh");
		arrMap.put("Age", "32");
		arrMap.put("Gender", "Male");
		arrMap.get("Age");
		Map<String, String> arr = new HashMap<String, String>();
		arr.put("Place", "PUNE");
		arr.put("Country", "India");
		arrMap.putAll(arr);
		System.out.println(arrMap.get("Name"));
		return arrMap;
	}

}
