import lombok.Getter;
import lombok.Setter;

public class Car {

    @Setter @Getter
    private String model;
    @Setter @Getter
    private String color;
    @Setter @Getter
    private String type;
    private double MAX_SPEED = 180;
    @Getter
    private double currentSpeed;
    private float cylinderCapacity;
    private float currentMileage;
    private double carPosition; //position compared to north
    private int MAX_GEAR = 6;
    private int currentGear;


    public Car(String model, String color, String type, float cylinderCapacity, double currentSpeed, float currentMileage, double carPosition, int currentGear) {
        this.model = model;
        this.color = color;
        this.type = type;
        this.cylinderCapacity = cylinderCapacity;
        this.currentSpeed = currentSpeed;
        this.currentMileage = currentMileage;
        this.carPosition = carPosition;
        this.currentGear = currentGear;
    }

    public Car(String color, String type, float cylinderCapacity, String model, double carPosition) {
        this.color = color;
        this.type = type;
        this.cylinderCapacity = cylinderCapacity;
        this.model = model;
        this.carPosition = carPosition;
    }

    public Car() {
    }

    public void startCar(){
        currentGear = 1;
        currentSpeed = 5;

    }

    public void steerLeft(float angle){
        carPosition -= angle;

    }
    public void steerRight(float angle){
        carPosition += angle;
    }
    public void stopCar(){
        currentSpeed = 0;
        currentGear = 0;
    }
    public void increaseMileage(float mileage){
        currentMileage += mileage;
    }
    public void speed(double speedDelta){
        if(currentSpeed + speedDelta > MAX_SPEED){
            currentSpeed = MAX_SPEED;
        }
        else {
            currentSpeed += speedDelta;
        }
    }
    public void decelerate(double speedDelta){
        if(currentSpeed - speedDelta < 0)
        {
            currentSpeed = 0;
        }
        else {
            currentSpeed -= speedDelta;
        }
    }
    public void gearUp(){
        if(currentGear < MAX_GEAR){
            currentGear ++;
        }
    }
    public void gearDown(){
        if (currentGear > 0){
            currentGear--;
        }
    }
    public void printCar(){
        System.out.println("-----------");
        System.out.println("Car model: "+ model);
        System.out.println("Car color: " + color);
        System.out.println("Car type: " + type);
        System.out.println("Car position (based on North): "+ carPosition);
        System.out.println("Car mileage: "+ currentMileage);
        System.out.println("Car gear: "+ currentGear);
        System.out.println("Car speed: "+ currentSpeed);
    }

    public void setSpeed(double currentSpeed){
        if (currentSpeed > MAX_SPEED){
            System.out.println("Invalid speed" + currentSpeed);
        }
        this.currentSpeed=currentSpeed;
    }

}
