class Car {
    private String brand;

    
    public Car() {
        this.brand = "Ford";
    }

   
    public String getBrand() {
        return this.brand;
    }
}

public class Sample {
    public static void main(String[] args) {
        
        Car myCar = new Car();

        
        String carBrand = myCar.getBrand();

        
        System.out.println("Car Brand: " + carBrand);
    }
}
