import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
public class Shape extends AbsrtactShape implements IShape {

    @Getter@Setter
    private String colour;

    public void draw(){
        System.out.println("Drawing a shape");

    }
    public void erase(){
        System.out.println("Erasing a shape");
    }

    @Override
    public void myMethod() {

    }
}
