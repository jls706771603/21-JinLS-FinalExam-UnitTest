import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    @Test
    public void testAdd1() {
    	boolean thrown = false;
    	try {
    		StringCalculator.add("-1,5");
    	} catch (IllegalArgumentException e) {
    		thrown = true;
    	}
    	assertTrue(thrown);
    }
    @Test
    public void testRemoveNthCharacter9() {
    	int result=StringCalculator.add("1,1000");
    	assertEquals(1, result);
    }
}