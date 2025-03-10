package section39_JavaOOP_Part3_Collections_API;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Set interface is implemented by HashSet, LinkedSet and TreeSet
 * - no guarantee elements are stored in order
 * - not accept duplicated value
 */

public class Set_HashSet_Iterator {

	public static void main(String[] args) {

		hashSetDemo();
		
		iteratorDemo();
		
	}
	
	static void hashSetDemo() {
		
//		HashSet hs1 = new HashSet();
		HashSet<?> hs2 = new HashSet<Object>();
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		System.out.println(hs);						// [USA, UK, INDIA]
		
		hs.add("INDIA");
		System.out.println(hs);						// [USA, UK, INDIA]
		
		hs.remove("INDIA");
		System.out.println(hs);						// [USA, UK]
		
		// =======
		System.out.println(hs.isEmpty());			// false
		System.out.println(hs.size());				// 2
		
		
	}
	
	static void iteratorDemo() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("he");
		hs.add("she");
		
		Iterator<String> it1 = hs.iterator();
		System.out.println(it1.next());	//   0 index	- she
		System.out.println(it1.next());	// 1st index	- USA
		System.out.println(it1.next());	// 2nd index	- UK
		System.out.println(it1.next());	// 3rd index 	- he
		
		Iterator<String> it2 = hs.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	}

}
