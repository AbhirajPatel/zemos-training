package classes;

import classes.OuterClass1.*;
import classes.OuterClass1.InnerClass1;

/**
 * Created by zemoso on 12/7/17.
 */
public class OuterClass2 {

    class InnerClass extends OuterClass1.InnerClass1 {
        InnerClass() {

            new OuterClass1().super();
            System.out.println("this is second inner class");
            // inorder to complete the inheritence create the instance of enclosing class.
        }


        public void innermethod() {
            System.out.println("inner class2 method is invoked");
        }

    }


}
