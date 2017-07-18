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
    public static boolean isInteger(String s) {
        boolean isValidInteger = false;
        try
        {
            Integer.parseInt(s);

            isValidInteger = true;
            if(Integer.parseInt(s)>3)
                isValidInteger = false;
        }
        catch (NumberFormatException ex)
        {
            // s is not an integer
        }

        return isValidInteger;
    }


    public static void main(String[] args) {


        ExceptionThrowing exp = new ExceptionThrowing();
        System.out.println("for null pointer exception enter '0' else any between 1-3");
        String int_var;
        //int con_int;
        while(true ) {
            Scanner sc = new Scanner(System.in);

            int_var = sc.nextLine();
            if (isInteger(int_var) )
                break;
            else
                System.out.println("sorry, please enter only integer between 0-3");
        }
                try {
            exp.through(Integer.parseInt(int_var));


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

