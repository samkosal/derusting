public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] array = new String[4];

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    array[0] = "Apple";           
    array[1] = "Cherry"; 
    array[2] = "Orange";
    array[3] = "Peach"; 
    // Get the value of the array at index 2
    String Index2 = array[1];
    // Get the length of the array
    Integer arrayLength = array.length;
    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < arrayLength; i++) {
      System.out.println(array[i]);
    }
    // Iterate over the array using a for-each loop and print out each item\
    for (String word : array) {
      System.out.println(word);
    }

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
