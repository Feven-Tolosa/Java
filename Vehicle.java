class Vehicle {
    protected String brand = "Ford";
    public void honk() {
      System.out.println("Tuut, tuut!");
    }
    public static void main(String[] args) {
      Vehicle myVehicle = new Vehicle();
      myVehicle.honk();
    }
  }
  
  class Car extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args) {
      Car myFastCar = new Car();
      myFastCar.honk();
      System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
  }