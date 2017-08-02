/**
 * Created by zemoso on 1/8/17.
 */
package abhiraj.assignment.singleton;


public final class TestClass2 {

    private static final TestClass2 testClass2 = new TestClass2();    // singleton pattern; 
    private static String stringVar;
    /*- non static variable name cannot be referenced from a static context, that's why i made it to be a static variable */

    /**
     * will initialise the string variable and return the instance of the this class.
     *
     * @param arg
     * @return
     */
    public static TestClass2 initialiseNgetInstance(String arg) {
        stringVar = arg;
    	/* - a static method can have access only to static variables and static methods, static fields and methods are
    	shared with all instances of the class and they are like globle type of thing for all instance of the class */
        return testClass2;
    }

    /**
     * will use to print the string variable of the class as define.
     */
    public void printString() {
        System.out.println(stringVar);
    }

}

