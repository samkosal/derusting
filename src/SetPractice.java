import java.util.HashSet;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    HashSet<String> Strings = new HashSet<>();

    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
    Strings.add("Apple");
    Strings.add("Opple");
    Strings.add("Epple");
    System.out.println(Strings);

    // Check whether the Set contains a given String
    if (Strings.contains("Opple")) {
      System.out.println(true);
    }

    // Remove an element from the Set
    Strings.remove("Epple");
    System.out.println(Strings);

    // Get the size of the Set
    int size = Strings.size();
    System.out.println(size);

    // Iterate over the elements of the Set, printing each one on a separate line
    for (String str : Strings) {
      System.out.println(str);
    }
    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
