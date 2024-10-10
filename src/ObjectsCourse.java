public class ObjectsCourse {

    public static void main(String[] args) {

        Car vwPassat = new Car();

//        Car dacia1300 = new Car();
//        dacia1300.color = "RED";
//        dacia1300.type = "Sedan";
//        dacia1300.cylinderCapacity = 1300;
//        dacia1300.model = "dacia 1300";
//        dacia1300.carPosition = 45;

        Car dacia1300 = new Car("RED", "sedan", 1300, "dacia 1300",45);

        dacia1300.startCar();
        dacia1300.speed(20);
        dacia1300.gearUp();
        dacia1300.steerRight(45);
        dacia1300.increaseMileage(5);
        dacia1300.stopCar();


        dacia1300.printCar();
        vwPassat.printCar();

        Square squareabcd = new Square();
        squareabcd.setSide(5);
        squareabcd.printCurrentSquare();
        System.out.println("Square with side "+ squareabcd.squareSide + " has area of "+ squareabcd.getArea());

        for(String value : args){
            Square cmdSquare = new Square();
            cmdSquare.setSide(Double.parseDouble(value));
            cmdSquare.printCurrentSquare();
            Square.printSquare(cmdSquare); // static method
        }

        Rectangle rectangle = new Rectangle(4,10);
        System.out.println("Area is " + rectangle.getArea()
                + " diagonal is " + rectangle.getDiagonal()
                + " perimeter is " + rectangle.getPerimeter());
    }
}
