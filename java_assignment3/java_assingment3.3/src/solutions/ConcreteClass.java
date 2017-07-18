package solutions;

import interfaces.NewInterface;

/**
 * Created by zemoso on 12/7/17.
 */
public abstract class ConcreteClass implements NewInterface { //ConcreteClass

    public void Method_1_2(){
        System.out.println("implementing from interface 1");
    }
    public void Method_2_2(){
        System.out.println("implementing from interface 1");
    }
    public void Method_3_2(){
        System.out.println("implementing from interface 3");
    }
    abstract  void  concrete_method();
}
