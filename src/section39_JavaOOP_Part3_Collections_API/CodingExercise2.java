package section39_JavaOOP_Part3_Collections_API;

import java.util.ArrayList;

/* Modifying and Analyzing an ArrayList */

public class CodingExercise2 {

    public static void main(String[] args) {
       /* 1. ArrayList Manipulation:
        - In the main function, modify the ArrayList a to contain the elements
        "apple", "banana", "cherry", "mango", "apple" (with duplicates).
        - Print the ArrayList after these additions.*/
        ArrayList <String> arrList = new ArrayList<String>();
        arrList.add("apple");
        arrList.add("banana");
        arrList.add("cherry");
        arrList.add("mango");
        arrList.add("apple");
        System.out.println("1. arrList: "+arrList);    //[apple, banana, cherry, mango, apple]

        /* 2. Element Removal:
        - Remove the first occurrence of "apple" from the ArrayList.
        - Print the ArrayList after the removal.*/
        arrList.remove(0);
        System.out.println("2. arrList: "+arrList);    //[banana, cherry, mango, apple]

        /*3. Element Search:
        - Check if the ArrayList contains the element "orange".
        - Print a message indicating whether "orange" is found or not.*/
        String fruit = "orange";
        System.out.println("3. Does arrList contain "+fruit+"? ");
        boolean isOrange = arrList.contains(fruit);
        if(isOrange){
            System.out.println(fruit+" is found");
        }else{
            System.out.println(fruit+" is not found");
        }

        /*4. Size and Content Check:
        - Print the size of the ArrayList.
        - Use a loop to iterate through the ArrayList and print the index and value of each element.*/
        System.out.println("4. arrList size: "+arrList.size());
        for (String s: arrList){
            System.out.println("index: "+arrList.indexOf(s)+" value: "+s);
        }
//        IntStream.range(0, arrList.size()).mapToObj(i -> "index: " + i + " value: " + arrList.get(i)).forEach(System.out::println);

    }

}
