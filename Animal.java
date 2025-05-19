// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
      System.out.println("Zzz");
    }
    public static void main(String[] args) {
      // Create an object of Animal
      Animal myAnimal = new Animal() {
        public void animalSound() {
          // The body of animalSound() is provided here
          System.out.println("The animal makes a sound");
        }
      };
      myAnimal.animalSound();
      myAnimal.sleep();
    }

  }
  
  // Subclass (inherit from Animal)
  class Pig extends Animal {
    public void animalSound() {
      // The body of animalSound() is provided here
      System.out.println("The pig says: wee wee");
    }
  }
  
  class Main {
    public static void main(String[] args) {
      Pig myPig = new Pig(); // Create a Pig object
      myPig.animalSound();
      myPig.sleep();
    }
  }
   
   
   
  
  