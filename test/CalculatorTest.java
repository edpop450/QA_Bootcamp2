import org.junit.jupiter.api.*;

public class CalculatorTest {

    Calculator c;

    @BeforeAll
    public static void classSetup(){
        System.out.println("Prepara testele din class");

    }


    @BeforeEach
    public void testSetup(){
        System.out.println("Ruleaza setup dupa fiecare test");
        c = new Calculator();
    }

    @Test
    public void testAddition01(){
        double result = c.compute(-3, 4, "+");
        Assertions.assertEquals(1, result, "Addition failed");
    }

    @Test
    public void testAddition02(){
        Assertions.assertEquals(14.5, c.compute(10, 4.5, "+"),"Addition failed");
    }

    @Test()
    public void testInvalidOperator(){
        IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, () ->
        {
            c.compute(5,7,"--");
        },"Operator not valid");

    }

    @Test()
    public void testInvalidDivisionBy0(){
        IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, () ->
        {
            c.compute(5,0,"/");
        },"Imparti la zero dilau");

    }

    @Test
    public void testSubtraction01(){
        Assertions.assertEquals(10,c.compute(5,-5,"-"),"Subtraction failed.");
    }

    @Test
    public void testMultiplication(){
        Assertions.assertEquals(10,c.compute(2,5,"*"),"Multiplication failed.");
    }

    @Test
    public void testSqrt(){
        Assertions.assertEquals(Math.sqrt(2),c.compute(2,2,"SQRT"),"Sqrt failed.");
    }

    @AfterEach
    public void cleanTest(){
        System.out.println("Clean after the test.");
    }

    @AfterAll
    public static void cleanClass(){
        System.out.println("Clean at the end.");
    }

}
