import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor @Setter @Getter
public class Student extends Person{

    private double[] grades;
    private void takeExam(){
        System.out.println("The student attends exam");
    };
}
