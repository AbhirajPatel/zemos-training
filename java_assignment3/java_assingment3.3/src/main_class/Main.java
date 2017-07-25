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
        obj.method11();
        obj.method21();
        obj.method31();
        obj.newMethod();
        obj.concrete_method();
        try {
            obj.takeInput();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
