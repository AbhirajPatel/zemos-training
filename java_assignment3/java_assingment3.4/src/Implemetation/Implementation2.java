package Implemetation;

import cycles.Bicycle;
import cycles.Tricycle;
import cycles.Unicycle;
import cycleFactory.CycleFactory;

/**
 * Created by zemoso on 12/7/17.
 */
public class Implementation2 implements CycleFactory {

    public Implementation1 getcycle(){
     return new Implementation1() ;
    }


    public Bicycle getbicycle(){
        return new Implementation1();
    }

    public Tricycle gettricycle(){
        return new Implementation1();
    }

    public Unicycle getunicycle() {return new Implementation1();}


}
