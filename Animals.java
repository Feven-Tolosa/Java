class Animals {
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
    public static void main(String[] args) {
      Animals myAnimal = new Animals();
      myAnimal.animalSound();
    }
  }
  
  class Pig extends Animals {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
  }
  
  class Dog extends Animals {
    public void animalSound() {
      System.out.println("The dog says: bow wow");
    }
  }
  class Main {
    public static void main(String[] args) {
      Animals myAnimal = new Animals();  // Create a Animals object
      Animals myPig = new Pig();  // Create a Pig object
      Animals myDog = new Dog();  // Create a Dog object
      myAnimal.animalSound();
      myPig.animalSound();
      myDog.animalSound();
    }
  }
