package example;

import java.util.HashMap;

public class TestHashMap{
	HashMap<Integer, String> myMap = new HashMap<>();
	
	myMap.put(1,"James");
	myMap.put(2,"Mike");
	myMap.put(3,"Mary");
	
	System.out.println("The String stored under the key \"3\" is ":
	myMap.get(3));
}