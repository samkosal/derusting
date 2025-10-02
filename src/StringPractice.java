import java.util.ArrayList;
import java.util.List;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String word = "hello";
    // Find the length of the string
    int length = word.length();
    System.out.println(length);

    // Concatenate (add) two strings together and reassign the result
    word += " world";

    // Find the value of the character at index 3
    char index3 = word.charAt(3);
    System.out.println(index3);

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    if (word.contains("world")) {
      System.out.println(word);
    }
    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 1; i < word.length(); i++) {
      char index = word.charAt(i);
      System.out.println(index);
    }

    // Create an ArrayList of Strings and assign it to a variable
    List<String> ArrayList = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)
    ArrayList.add("Cherry");
    ArrayList.add("Cherry");
    ArrayList.add("Orange"); 
    System.out.println(ArrayList);
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String Com = String.join(", ", ArrayList);
    System.out.println(Com);

    // Check whether two strings are equal
    outerLoop:
    for (int i = 0; i < ArrayList.size(); i++ ) {
      String current = ArrayList.get(i);

      for (int j = 0; j < ArrayList.size(); j++ ) {
        if (i != j) {
          String current2 = ArrayList.get(j);
          
          if (current.equals(current2)) {
            System.out.println(current2);
            break outerLoop;
          }
        }
      }
    }

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
