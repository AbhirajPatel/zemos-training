/**
 * Created by zemoso on 1/8/17.
 */
package abhiraj.assignment.data;

public class TestClass1 {


    private int intVar;
    private char charVar;

    /**
     * this non static method will print the global variable as define.
     */
    public void printGlobalVar() {
        System.out.println("printing: \n" + intVar + "\n" + charVar);
    }

    /**
     * this will print the local variable define in it.
     */
    public void printLocalVar() {
        int localIntVar = 2;
        char localCharVar = 'd';
     /*
     (local varialbe can't left uninitialised)
     java doest not allow the initialisation of the local variable by default , there inital value is undefiened but
     for the member variable java assing them a default value, so local variable must be initialised other wise it will
      give compilation error. */

        System.out.println("printing: \n" + localIntVar + "\n" + localCharVar);
    }
}

