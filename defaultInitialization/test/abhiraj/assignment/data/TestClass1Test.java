package abhiraj.assignment.data;

import static org.junit.Assert.*;

/**
 * Created by zemoso on 1/8/17.
 */
public class TestClass1Test {
    @org.junit.Test
    public void printGlobalVar() throws Exception {
        TestClass1 testClass1 = new TestClass1();
        testClass1.printGlobalVar();
    }

    @org.junit.Test
    public void printLocalVar() throws Exception {
        TestClass1 testClass1 = new TestClass1();
        testClass1.printLocalVar();
    }

}