/**
 * Created by zemoso on 1/8/17.
 */
package abhiraj.assignment.main;

import abhiraj.assignment.data.TestClass1; // importing the class1
import abhiraj.assignment.singleton.TestClass2; // importing the class2.

public class MainClass {
    /*  singleton pattern  */
    private static final TestClass2 testClass2 = TestClass2.initialisation("ZeMoSo");

    /**
     * main method to execute the programme.
     *
     * @param arg
     */
    public static void main(String arg[]) {

        TestClass1 testClass1 = new TestClass1();
        testClass1.printGlobalVar();
        testClass1.printLocalVar();

        testClass2.printString(); /* this will print the argument that we have passed to it */
    }
}

