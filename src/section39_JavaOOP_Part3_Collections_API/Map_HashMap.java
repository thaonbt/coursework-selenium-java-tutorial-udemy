package section39_JavaOOP_Part3_Collections_API;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map interface is implemented by ArrayList, LinkedList and Vector
 * - not accept duplicated keys
 */

public class Map_HashMap {

	public static void main(String[] args) {

		hashMapDemo();
		
		hashMap_entrySet_demo();
		
	}
	
	static void hashMapDemo() {
		
//		HashMap hm1 = new HashMap();
		HashMap<?, ?> hm2 = new HashMap<Object, Object>();
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "good bye");
		hm.put(42, "morning");
		hm.put(3, "evening");
		
		System.out.println(hm);				// {0=hello, 1=good bye, 3=evening, 42=morning}
		
		System.out.println(hm.get(2));		// null
		
		System.out.println(hm.get(42));		// morning
		
		hm.remove(42);
		System.out.println(hm.get(42));		// null
		
	}
	
	static void hashMap_entrySet_demo(){
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "good bye");
		hm.put(42, "mornig");
		hm.put(3, "evening");
		
		Set<?> set = hm.entrySet();
		Iterator<?> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());			// key = value
			
			Map.Entry mapEntry = (Map.Entry) iterator.next();
			System.out.println(mapEntry.getKey());			// key
			System.out.println(mapEntry.getValue());		// value
		}
	}

}
