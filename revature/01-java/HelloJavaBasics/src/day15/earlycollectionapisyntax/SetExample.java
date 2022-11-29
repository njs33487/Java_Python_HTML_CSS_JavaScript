package day15.earlycollectionapisyntax;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        //HASH SET
    	/*
    	 * List vs Set
    	 * 
    	 * A List IS indexable and it DOES allow duplicates
    	 * 
    	 * A Set is NOT indexable and it ONLY contains unique values
    	 * 			(we'll cover the reasons later)
    	 */

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(10);
        hashSet.add(5); //it just ignores this insertion
        hashSet.add(88);
        hashSet.add(95);
        hashSet.add(5); //it just ignores this insertion
        hashSet.add(-600);
        

        System.out.println(hashSet); //notice how the set does NOT contain duplicates, only unique values
        System.out.println(hashSet.size()); 
//        System.out.println(hashSet.get(2)); //cannot use index, there is no "get" method
        System.out.println(hashSet.contains(88)); //returns true

        //ALSO a particularly useful method
//        hashSet.remove(Obj o)
        

        ///TREE SET
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(hashSet);
        System.out.println(treeSet);

//        //what happens if we add a value to hashSet?
        hashSet.add(25); //you'll have to manually go in and add the 25     treeSet.add(25);
        System.out.println(treeSet);
    }

}