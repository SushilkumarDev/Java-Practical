Main Class

package com.company;

public class Main {
    public static void main(String[] args) {
        Automobile auto = new Automobile(20,  "LandROver",
                "2018",  200000,  10);

        Car car = new Car( 150, "Audi",  10,
                "Yes",  "Yes",  "1000kWatt",
                "Yes",  "1.5 inch");

        auto.movement();
        car.movement();
        auto.speed(50);
        car.speed(60);
    }
}

Automobile Class
public class Automobile {
    private double topSpeed;
    private String brandName;
    private String yearOfManufacture;
    private double cost;
    private double durability;

    public Automobile(double topSpeed, String brandName, String yearOfManufacture,
     double cost, double durability) {
        
        this.topSpeed = topSpeed;
        this.brandName = brandName;
        this.yearOfManufacture = yearOfManufacture;
        this.cost = cost;
        this.durability = durability;
        
        
    }
    
    public void movement() {
         System.out.println("Automobile.movement() was called and Automobile moves");
    }

    public void speed(int speed) {
       System.out.println("The automobile is moving at a speed of : "+speed);
    }
}


Car Class
package com.company;

public class Car extends Automobile {
    private String SteeringWheel;
    private String Moonroof;
    private String BatterySize;

    private String Headlamps;
    private String GroundClearance;

    public Car(double topSpeed, String brandName, double durability, String steeringWheel, String moonroof,
                String batterySize, String headlamps, String groundClearance) {
        super(topSpeed, brandName, durability, yearOfManufacture: 2018, cost: 1000000);
        SteeringWheel = steeringWheel;
        Moonroof = moonroof;
        BatterySize = batterySize;
        Headlamps = headlamps;
        GroundClearance = groundClearance;
    }
    
    @Override
        public void movement() {
        System.out.println("Car is driven on roads");
        super.movement();
    }

        public void carspeed(int speed) {
        speed(speed);
    }

    @Override
        public void speed(int speed) {
        System.out.println("The car speed is: " + speed);
    }
}
