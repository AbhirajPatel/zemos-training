package Implemetation;

/**
 * Created by zemoso on 12/7/17.
 */
public class MainFactories {

    public static void instantiation( Implementation2 fact) {
      Implementation1 implementation1 = fact.getcycle();
        /**
         *  "cycle, unicycle,tricycle are the methods that are in cycle, bicyle, tricycle, unicycle,
         *  interfaces have.
         *
         */
      implementation1.cycle();
      implementation1.bicycle();
      implementation1.unicycle();
      implementation1.tricycle();
    }

    public static void main(String args[])
    {
        instantiation(new Implementation2());
    }
}
