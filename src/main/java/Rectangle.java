import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor@AllArgsConstructor
public class Rectangle extends Shape{
    private double length;
    private double width;

    public double getArea(){
        return this.length * this.width;
    }
    public double getDiagonal(){
        return Math.sqrt(Math.pow(length,2) + Math.pow(width, 2));
    }
    public double getPerimeter(){
        return 2*this.length + 2*this.width;
    }
    @Override
    public void draw(){
       // super.draw(); //this calls the method from superclass
        System.out.println("Drawing a rectangle");
    }
}
