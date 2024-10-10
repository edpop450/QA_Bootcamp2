import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor

public class Square {
    @Getter @Setter
    public double squareSide;

    public Square(double squareSide){
        this.squareSide=squareSide;
    }

    public void setSide(double side){
        squareSide = side;
    }

    public double getArea(){
    //    return squareSide * squareSide;
        return Math.pow(squareSide, 2);
    }
    public void printCurrentSquare(){
        System.out.println("Square with side "+ squareSide+ " has area of "+ getArea());
    }

    public static void printSquare(Square cmdSquare){
        System.out.println("Square");
    }
}
