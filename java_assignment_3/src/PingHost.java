import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zemoso on 22/7/17.
 */
public class PingHost {

private static Process process = null;

    /**
     * return the median of the array
     * @param doubles
     * @return
     */
    public double median(double[] doubles) {
    Arrays.sort(doubles);

    if(doubles.length % 2 != 0)
        return doubles[doubles.length/2];
    else
        return (doubles[doubles.length/2 -1] + doubles[doubles.length/2])/2.0;
}

    /**
     * will run the comand and return output in the list<String>;
     * @param command
     * @return
     */
    public   List<String> ping(String command) {

        try {
           process = Runtime.getRuntime().exec(command);

            //process.wait();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStreamReader inputStreamReader = new InputStreamReader(process.getInputStream());
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String st = new String();
        List<String> output = new ArrayList<>();

        try {
            while((st = reader.readLine() )!= null)
                output.add(st);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return output;

        // Read the outpu
    }

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {

    PingHost pingHost = new PingHost();
        System.out.println("enter the no of time u want to png");
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        System.out.println("enter the website you want to ping");
       int i=0;


        String input = sc.next();
        String command = "ping -c "+String.valueOf(number) + " "+input;


        System.out.println(command);

        double time[] = new double[number];


        try {

            List<String> strings = pingHost.ping(command);

            for (String string : strings)
            {

                if(string.contains("time=")) {
                    System.out.println(string);

                    time[i++] = (Double.parseDouble(string
                            .substring(string.lastIndexOf("=") + 1,
                                    string.length() - 3)));
                }
            }

         //process.waitFor();
        }

        catch (Exception e)
        {
            System.out.println(e.toString());
        }

        if(i == 0)
            System.out.println("can not reach.....");
        else
        System.out.println("median of time taken :" + pingHost.median(time));

    }

}
