package abhiraj.assignment.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zemoso on 1/8/17.
 */
public class TestClass2Test {
    @Test
    public void initialisation() throws Exception {
        TestClass2 testClass2 = TestClass2.initialisation("Abhiraj");
        testClass2.printString();
    }

}