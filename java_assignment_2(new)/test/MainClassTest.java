import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zemoso on 24/7/17.
 */
public class MainClassTest {
    @Test
    public void testString() throws Exception {

        assertTrue(MainClass.testString("AabcdefghIjklMnopqrstuvwxyZ"));
    }
}