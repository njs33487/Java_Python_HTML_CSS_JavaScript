package day15.earlycollectionapisyntax;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class ListExample {
	//WHAT IF I had a method that wanted to take in an ArrayList then later our team switches to a LinkedList
	public static void method1(List myList) {
		//stuff
	}

    public static void main(String[] args) {
        ///ARRAY LIST
    	List<String> myStringArrayList = new ArrayList<>(); //you can use whatever datatype you'd like
    	List<Thread> myThreadArrayList = new ArrayList<>();
//        	List<int> myPrimitiveArrayList = new ArrayList<>(); //you can't use primitives
    	myStringArrayList.add("hello");

    	
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(88);
        arrayList.add(95);
        arrayList.add(5);
        arrayList.add(-600);

        System.out.println(arrayList);
        System.out.println(arrayList.size()); //array.length
        System.out.println(arrayList.get(3));
//        System.out.println(arrayList.get(200)); //leads to an exception
//        System.out.println(arrayList.get(7));

        //these two are ALSO particularly useful methods
//        arrayList.indexOf(obj_to_compare);
//        arrayList.set(index, obj)
//        arrayList.add(index, obj)
//        arrayList.remove(index);

        ////LINKED LIST
        List<Integer> linkedList = new LinkedList<>();
        //it's used the same way as arrayList
        linkedList.add(45);
//        linkedList.addAll(arrayList);

        // Iterators

        ListIterator<Integer> listIterator = arrayList.listIterator();

        while (listIterator.hasNext()) {
        	System.out.print(listIterator.next() + "\t");
        }
        

        System.out.println();

        ListIterator<Integer> listIteratorTwo = arrayList.listIterator(arrayList.size());

        while (listIteratorTwo.hasPrevious()) {
            System.out.print(listIteratorTwo.previous() + "\t");
        }

    }

}