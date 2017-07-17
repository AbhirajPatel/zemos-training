package main_class;

import solutions.Implementing_interface;

import java.io.IOException;

/**
 * Created by zemoso on 12/7/17.
 */
public class Main {
    public static void main(String args[])
    {
        Implementing_interface obj = new Implementing_interface();
        obj.Method_1_1();
        obj.Method_2_1();
        obj.Method_3_1();
        obj.new_Method();
        obj.concrete_method();
        try {
            obj.takeInput();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
