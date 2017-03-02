import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Before public void testOthers(){

    }

    @Test public void testSomeLibraryMethod() {
        Calculator calc = new Calculator();
        assertEquals(calc.add(1,1), 2);
    }
}
