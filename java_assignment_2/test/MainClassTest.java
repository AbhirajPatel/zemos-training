import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zemoso on 24/7/17.
 */
public class MainClassTest {
    @Test
    public void testString() throws Exception {
        MainClass.setInput("AabcdefghIjklMnopqrstuvwxyZ");
        assertTrue(MainClass.testString());
    }
    @Test
    public void testSetInput() throws Exception{
        MainClass.setInput("ZeMoSo");
        assertTrue("check" ,MainClass.getInput().equals("ZeMoSo"));

    }

}