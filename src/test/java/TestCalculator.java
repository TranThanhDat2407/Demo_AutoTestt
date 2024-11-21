import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {
    @Test
    public void testSum() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(3, 4), 7);
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sub(1,1),0);
    }
}
