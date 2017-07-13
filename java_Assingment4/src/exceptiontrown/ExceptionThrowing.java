package exceptiontrown;

import exception.NewException1;
import exception.NewException2;
import exception.NewException3;

/**
 * Created by zemoso on 13/7/17.
 */
public class ExceptionThrowing {
    public void through(int i) throws NewException2,NewException3,NewException1{

        if(i==1)
        {
            System.out.println("all exception can be thrown");
        throw new NewException1();}
        else if(i==2){
            System.out.println("all exception can be thrown");
            throw new NewException2();}
        else if (i==3){
            System.out.println("all exception can be thrown");
            throw new NewException3();}
            else if ( i == 0){
            System.out.println("NullPointerException thrown");
                throw new  NullPointerException();}
            else
                System.out.println("no eception thrown");
    }

}
