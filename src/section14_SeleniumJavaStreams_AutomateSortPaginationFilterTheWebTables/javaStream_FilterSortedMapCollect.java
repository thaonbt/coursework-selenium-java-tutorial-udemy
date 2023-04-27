package section14_SeleniumJavaStreams_AutomateSortPaginationFilterTheWebTables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class javaStream_FilterSortedMapCollect {

	/** Java Streams (from version 8) */
	/** What are Streams? 
	 *  Stream API is new feature available from Java 8
	 *  By using streams, we can perform various aggregate operations on the data returned from collections classes
	 *  by drastically reduce the complexity of code
	 */
	/** What is Lambda Expressions?
	 *  Lambda Expression introduce the new arrow operator -> into Java.
	 *  It divides the lambda expression in 2 parts:
	 *  - Part 1 (LEFT side) specifies the PARAMETERS required by the expression, 
	 *    which could also be empty if no parameters are required
	 *  - Part 2 (RIGHT side) is the lambda BODY which specifies the ACTIONS of the lambda expression 
	 */
	
//	@Test
	public void forLoop() {
		// TODO Auto-generated method stub

		//Count the number of names starting with alphabet A in list
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		int count = 0;
		for(int i=0; i<names.size(); i++) {
			String actual = names.get(i);
			if(actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
	}
	
//	@Test
	public void streamFilter() {
		/** Count the number of names starting with alphabet A in list */
		/** Use collection like ArrayList */
		System.out.println("******");
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");

		// there is no life for intermediate operation if there is no terminal operation
		// terminal operation will execute only if intermediate operation (example: "filter") returns true
		Long count = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(count);
		
		/** User stream instead of collections*/
		System.out.println("******");
		// instead of creating a collection like the above ArrayList
		// and then convert it into stream, 
		// we can create a stream
		long d =
			Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(s ->
			{
				s.startsWith("A");
				return false;
			}).count();
		System.out.println(d);
		
		/** Print all items follow conditions*/
		System.out.println("******");
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		System.out.println("******");
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}

//	@Test
	public void streamMap() {
		//print names which have last letter as 'a' with Uppercase
		System.out.println("******");
		Stream.of("Azbhijeet", "Don", "Alekhya", "Adam", "Rama")
			.filter (s->s.endsWith("a"))		// "Alekhya", "Rama"
			.map    (s->s.toUpperCase())		// "ALEKHYA", "RAMA"
			.forEach(s->System.out.println(s));
		
		//print names which have first letter as 'a' with uppercase and sorted
		System.out.println("******");
		List<String> namesList = Arrays.asList("Azbhijeet", "Don", "Alekhya", "Adam", "Rama");
		namesList.stream()
			.filter(s->s.startsWith("A"))		// "Azbhijeet", "Alekhya", "Adam"
			.sorted()							// "Adam", "Alekhya", "Azbhijeet"
			.map(s->s.toUpperCase())			// "ADAM", "ALEKHYA", "AZBHIJEET"
			.forEach(s->System.out.println(s));
		
		//combine 2 list into 1
		System.out.println("******");
		ArrayList<String> namesArrList = new ArrayList<String>();
		namesArrList.add("man");
		namesArrList.add("Don");
		namesArrList.add("women");
		
		Stream<String> combinedStream = Stream.concat(namesList.stream(), namesArrList.stream());
		combinedStream.sorted().forEach(s->System.out.println(s));
		
		boolean flag =  combinedStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
	}
	
	@Test
	public void streamCollect() {
		
		System.out.println("******");
		List<String> ls = Stream.of("Azbhijeet", "Don", "Alekhya", "Adam", "Rama")
			.filter (s->s.endsWith("a"))		// "Alekhya", "Rama"
			.map    (s->s.toUpperCase())		// "ALEKHYA", "RAMA"
			.collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
		//print unique number from this array
		//sort the array -> 1,2,3,5,7,9
		//3rd index
		List<Integer> sortedList = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(sortedList.get(2));
		
	}
}
