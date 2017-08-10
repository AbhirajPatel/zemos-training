import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zemoso on 10/8/17.
 */

/**
 * unit test for checkMatching method ;
 */
public class PAtternTest {
    @Test
    public void checkMatching() throws Exception {
        assertEquals(PAttern.checkMatching("abhiraj."), true);
        assertEquals(PAttern.checkMatching("abhiraj"), true);
    }

}