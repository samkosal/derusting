public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float numNe = -2.0f;
    
    // Create an int with a positive value and assign it to a variable
    Integer numPo = 4;
    // Use the modulo % operator to find the remainder when the int is divided by 3
    float Mod = numPo % 3;
    System.out.println(Mod);

    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.
    if (numPo % 2 == 0) {
      System.out.println("Even");
    }
    else if (numPo % 2 != 0) {
      System.out.println("Odd");
    }

    // Divide the number by another number using integer division
    int result = numPo / 2;
    System.out.println(result);

    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
