import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class StringCalculatorTest {
 private final StringCalculator c=new StringCalculator();
 @Test void defaults(){assertEquals(0,c.add(""));assertEquals(6,c.add("1,2\n3"));}
 @Test void custom(){assertEquals(3,c.add("//;\n1;2"));assertEquals(6,c.add("//[*][%]\n1*2%3"));}
 @Test void large(){assertEquals(2,c.add("2,1001"));}
 @Test void negatives(){var e=assertThrows(IllegalArgumentException.class,()->c.add("1,-2,-3"));assertTrue(e.getMessage().contains("-2, -3"));}
}
