package mainClass;

import solutions.ImplementingInterface;

import java.io.IOException;

/**
 * Created by zemoso on 12/7/17.
 */
public class MainClass {
    public static void main(String args[])
    {
        ImplementingInterface obj = new ImplementingInterface();
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
