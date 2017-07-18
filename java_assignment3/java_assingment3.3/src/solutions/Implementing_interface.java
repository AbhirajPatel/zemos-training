package solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by zemoso on 12/7/17.
 */
public class Implementing_interface  extends ConcreteClass{

    public void Method_1_1(){
         System.out.println("implementing from interface 1");
     }

    public void Method_2_1(){
        System.out.println("implementing from interface 2");
    }

    public void Method_3_1(){
        System.out.println("implementing from interface 3");
    }

    @Override
    public void new_Method(){
        System.out.println("implementing from interface new interface");
    }

    public void concrete_method(){
        System.out.println("inheriteng from concrete class");
    }

    public void takeInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input value is character : "+String.valueOf(isCharInput(br.readLine())));
    }

    private boolean isCharInput(String input){
        return input.contains("abcd");
    }
}
