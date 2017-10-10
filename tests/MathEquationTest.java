import com.pluralsight.Switch.MathEquation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by AWESOME on 24/07/2017.
 */
public class MathEquationTest {
    private MathEquation mathEquation;

    @Before
    public void setUp(){
        mathEquation = new MathEquation(1, 5);
    }

    @After
    public void tearDown(){}

    @Test
    public void shouldTestAddNumbers(){
       int sum =  mathEquation.addNumbers();
       assertTrue(sum==6);
    }

}
