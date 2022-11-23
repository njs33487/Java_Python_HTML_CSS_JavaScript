package day15.earlycollectionapisyntax;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapExample {

    public static void main(String[] args) {
    
        ///HASHMAP
        //  (key)  , (value)
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(5, "ScreenSlaver");
        hashMap.put(8, "Joker");
        hashMap.put(2, "Venom");
        hashMap.put(-88, "Maleficient");
        hashMap.put(0, "TaskMaster");
        hashMap.put(0, "Squirrel Girl"); //is replacing the origin "TaskMaster" value
        hashMap.put(55, null);
        

        System.out.println(hashMap);
//        System.out.println(hashMap.size());
//        System.out.println(hashMap.get(2));
//        System.out.println(hashMap.get(-88));
//		System.out.println(hashMap.get(200)); //null
//		System.out.println(hashMap.get(55));
		
		//other useful methods include:
//		hashMap.replace(key, value)
//		hashMap.remove(Object o)
		
		//Keys can be whatever datatype you'd like
		Map<String, String> otherMap = new HashMap<>();
//    	otherMap.put("SpaceMonkey", "Hello PictureFrame");
//    	System.out.println(otherMap.get("SpaceMonkey"));
    	
    	//the generics can be anything
    	Map<String, ArrayList> hashMapOtherExample = new HashMap<>();
    	Map<Map, LinkedList> hashMapOtherExample2 = new HashMap<>();
    	

//		//TREEMAP
        Map<Integer, String> treeMap = new TreeMap<>();
//        treeMap.putAll(hashMap);
//        System.out.println(treeMap);


        //Loop
        //You can iterate over...the key set (SET COLLECTION), the value list (LIST COLLECTION)
        // or the entry set(both)
        for(Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey()+ "\t"+entry.getValue());
            //this is an example of iterating over the entry set
            //   later, try to iterate over one or the other
        }
    }
}