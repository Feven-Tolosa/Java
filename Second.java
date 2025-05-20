public class Second {
  public static void main(String[] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    } finally {
      System.out.println("The 'try catch' is finished.");
    }
  }
}

// If an error occurs, we can use try...catch to catch the error and execute some code to handle it:
// The finally statement lets you execute code, after try...catch, regardless of the result: