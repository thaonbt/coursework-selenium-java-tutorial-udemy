package section36_JavaOOP_Part3_Collections_API;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * HashMap and Hashtable
 * - code looks similar, 
 * - but have slightly difference
 *   |-1. Synchronisation (or Thread Safe) - this is the most important different
 *   |      |- HashMap: is non-synchronised and not thread safe => use when not require any multi-threading tasks
 *   |		|   (means: 5 threads work on this HashMap concurrently
 *   |      |- Hashtable: is synchronised and thread safe		=> use when require multi-threading tasks
 *   |		|   (means: when there is 1 access to this Hashtable, others need to wait
 *   |		|
 *   |-2. Null keys and Null values  
 *   |      |- HashMap: allows 1 null key, and any null values
 *   |      |- Hashtable: not allow null keys and null values
 *   |		|
 *   |-3. Iterating values
 *   |      |- HashMap uses Iterator to iterate its object values
 *   |      |- Hashtable uses Enumerator to iterate its object values
 *   |		|
 */

public class Map_HashMap_Hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hashMap_Demo();
		
		hashTable_Demo();
		
	}
	
	static void hashMap_Demo() {
		System.out.println("*** HashMap demo ***");
		
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
	
	static void hashTable_Demo() {
		System.out.println("*** Hashtable demo ***");
		
//		HashMap hm1 = new HashMap();
//		HashMap<?, ?> hm2 = new HashMap<Object, Object>();
		
//		Hashtable ht1 = new Hashtable();
//		Hashtable<?, ?> ht2 = new Hashtable<Object, Object>();
		
//		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

		hm.put(0, "hello");
		hm.put(1, "good bye");
		hm.put(42, "morning");
		hm.put(3, "evening");
		
		System.out.println(hm);				// {0=hello, 1=good bye, 3=evening, 42=morning}
		
		System.out.println(hm.get(2));		// null
		
		System.out.println(hm.get(42));		// morning
		
		hm.remove(42);
		System.out.println(hm.get(42));		// null
		
		Set<?> set = hm.entrySet();
		Iterator<?> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());			// Exception in thread "main" java.util.NoSuchElementException: Hashtable Enumerator
			
			Map.Entry mapEntry = (Map.Entry) iterator.next();
			System.out.println(mapEntry.getKey());			// Exception in thread "main" java.util.NoSuchElementException: Hashtable Enumerator
			System.out.println(mapEntry.getValue());		// Exception in thread "main" java.util.NoSuchElementException: Hashtable Enumerator
		}
		
	}

}
