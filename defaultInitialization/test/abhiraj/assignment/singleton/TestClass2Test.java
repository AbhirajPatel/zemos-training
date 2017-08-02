package abhiraj.assignment.singleton;

import org.junit.Test;

/**
 * Created by zemoso on 1/8/17.
 */
public class TestClass2Test {
    @Test
    public void initialiseNgetInstance() throws Exception {
        TestClass2 testClass2 = TestClass2.initialiseNgetInstance("Abhiraj");
        testClass2.printString();
    }

}