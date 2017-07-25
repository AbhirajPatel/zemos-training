package solutions;

import interfaces.NewInterface;

/**
 * Created by zemoso on 12/7/17.
 */
public abstract class ConcreteClass implements NewInterface { //ConcreteClass

    public void method12(){
        System.out.println("implementing from interface 1");
    }
    public void method22(){
        System.out.println("implementing from interface 1");
    }
    public void method32(){
        System.out.println("implementing from interface 3");
    }
    abstract  void  concrete_method();
}
