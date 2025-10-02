import java.util.HashMap;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> Map = new HashMap<>();

    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    Map.put("Apple", 1);
    Map.put("Banana", 2);
    Map.put("Orange", 3);

    // Get the value associated with a given key in the Map
    Integer givenvalue = Map.get("Apple");

    // Find the size (number of key/value pairs) of the Map
    Integer Size = Map.size();

    // Replace the value associated with a given key (the size of the Map shoukld not change)
    Map.put("Apple", 4);
    // Check whether the Map contains a given key
    if (Map.containsKey("Apple")) {
      System.out.println(true);
    }

    // Check whether the Map contains a given value
    if (Map.containsValue(4)) {
      System.out.println(true);
    }
    System.out.println();
    // Iterate over the keys of the Map, printing each key
    for (String key : Map.keySet()) {
      System.out.println(key);
    }
    // Iterate over the values of the map, printing each value
    for (Integer value : Map.values()) {
      System.out.println(value);
    }

    // Iterate over the entries in the map, printing each key and value
    for (Map.Entry<String, Integer> entry : Map.entrySet()) {
      System.err.println(entry);
    }
    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
