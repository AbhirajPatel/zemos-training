package Implemetation;

/**
 * Created by zemoso on 12/7/17.
 */
public class Factories {

    public static void instantiation( Implementation2 fact) {
      Implementation1 i = fact.getcycle();
        /**
         *  "o1_1, 01_2, o1_3,o1_4 are the methods that are in cycle, bicyle, tricycle, unicycle,
         *  interfaces have.
         *  i have taken like that in order to test the Implemetation.Factories of all theses, basically hiding the
         *  information,
         */
      i.o1_1();
      i.o1_2();
      i.o1_3();
      i.o1_4();
    }

    public static void main(String args[])
    {
        instantiation(new Implementation2());
    }
}
