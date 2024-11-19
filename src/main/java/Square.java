import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

 @Setter @NoArgsConstructor
public class Square extends Rectangle{
    @Setter
    public double side;

    public Square(double side){
        super(side,side);
    }
    public static void printSquare(Square cmdSquare) {
    }

    public void setSide(double side){
        side = side;
    }
    @Override
    public double getArea(){
    //    return squareSide * squareSide;
        return super.getArea();
    }
    public void printCurrentSquare(){
        System.out.println("Square with side "+ getLength() + " has area of "+ getArea());
    }
    @Override
    public void draw(){
        System.out.println("Drawing a square");
    }
    @Override
    public String toString(){
        return "My square has 4 sides each "+ this.getLength();
    }

}
