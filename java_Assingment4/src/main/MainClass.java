package main;
import exception.NewException1;
import exception.NewException2;
import exception.NewException3;
import exceptiontrown.ExceptionThrowing;

import java.util.Scanner;


/**
 * Created by zemoso on 13/7/17.
 */

public class MainClass {

    public static void main(String[] args) {

        ExceptionThrowing exp = new ExceptionThrowing();
        System.out.println("for null pointer exception enter '0' else any between 1-3");
        Scanner sc = new Scanner(System.in);
                int int_var;
           int_var = sc.nextInt();
                try {
            exp.through(int_var);
        } catch (Exception e) {
            System.out.println("Caught it from exception thrown method !");}
            finally {
                    /**
                     * finally will always executed even we have use return in try block, no matter, finally
                     * will always be executed. (even we have thrown a nullPointerexception )
                     */
                System.out.println("finally is executed");
                    }
        }
    }

