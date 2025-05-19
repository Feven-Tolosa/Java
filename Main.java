public class Main {
    int x = 55;
    final int y = 10;
  
    public static void main(String[] args) {
      Main myObj = new Main();
      myObj.x = 50;
      System.out.println(myObj.x);
    }
  }
  