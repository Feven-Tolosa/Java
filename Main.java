public class Main {
    int x = 5;
    String fname = "John";
    String lname = "Doe";
    int age = 24;
  
    public static void main(String[] args) {
    //   Main myObj1 = new Main();  // Object 1
    //   Main myObj2 = new Main();  // Object 2
    //   myObj2.x = 25;
    //   System.out.println(myObj1.x);  // Outputs 5
    //   System.out.println(myObj2.x);  // Outputs 25
      Main myObj = new Main();
      System.out.println("Name: " + myObj.fname + " " + myObj.lname);
      System.out.println("Age: " + myObj.age);
      myMethod();
    }
    static void myMethod() {
        System.out.println("Hello World!");
      }
  }
   

// Public, which can only be accessed by objects
// Static method, which means that it can be accessed without creating an object of the class, unlike public