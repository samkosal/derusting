import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ListPractice {

  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> ArrayList = new ArrayList<>();

    // Add 3 elements to the list (OK to do one-by-one)
    ArrayList.add("Apple");
    ArrayList.add("Cherry");
    ArrayList.add("Orange");        
    // Print the element at index 1
    System.out.println(ArrayList.get(1));

    // Replace the element at index 1 with a new value
    ArrayList.set(1, "Peach");
    
    // (Do not insert a new value. The length of the list should not change)

    // Insert a new element at index 0 (the length of the list will change)
    ArrayList.add(0, "Banana");

    // Check whether the list contains a certain string
    // which String?
    if (ArrayList.contains("Peach")) {
      System.out.println("Peach");
    } 
    // Iterate over the list using a traditional for-loop.
    for (int i = 0; i < ArrayList.size(); i++) {
      // Print each index and value on a separate line
      System.out.println("Index:" + i);
      System.out.println("Value:" + ArrayList.get(i));
      System.out.println("");
    }

    // Sort the list using the Collections library
    Collections.sort(ArrayList);

    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for (String word : ArrayList) {
      System.out.println(word);
    }

    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}