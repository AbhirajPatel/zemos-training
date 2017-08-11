/**
 * Created by zemoso on 11/7/17.
 */

/**
 * same as the Mouse class but in next hirechy
 */
public class Gerbil extends Rodent {
    Gerbil( )     // default constructor
        {
            System.out.println("this is a Gerbil");
    }
    @Override
    public void properties(){
        System.out.println("this is a Rodent-Gerbil");
    }
}

