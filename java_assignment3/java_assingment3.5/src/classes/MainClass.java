package classes;
import classes.OuterClass2;
import classes.OuterClass1;
import classes.OuterClass1.*;
import classes.OuterClass2.*;

/**
 * Created by zemoso on 12/7/17.
 */
public class MainClass {
    public static void main(String args[]){

        OuterClass2 obj = new OuterClass2();                            /*make the object */
        OuterClass2.InnerClass InClass_obj = obj.new  InnerClass ();    /* of the inner class*/

    }
}
