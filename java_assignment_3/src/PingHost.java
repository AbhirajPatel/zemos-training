import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by zemoso on 22/7/17.
 */

/**
 * can ping the given host and give the median of the time taken to ping,
 * can give the median of an array.
 */
public class PingHost {

    /**
     * return the median of an double array
     * @param doubles
     * @return
     */
    public static double median(double[] doubles) {
    Arrays.sort(doubles);

    if(doubles.length % 2 != 0)
        return doubles[doubles.length/2];
    else
        return (doubles[doubles.length/2 -1] + doubles[doubles.length/2])/2.0;
}

    /**
     * will run the comand and return the median of the time taken by it;
     * @param command
     * @return
     */
    public static double pingNmedian(String command, int Ntime) {
         Process process ;
       int count=0;
        double[] time = new double[Ntime];
        String string = new String();
        try {
           process = Runtime.getRuntime().exec(command);
            InputStreamReader inputStreamReader = new InputStreamReader(process.getInputStream());
            BufferedReader reader = new BufferedReader(inputStreamReader);

            while((string = reader.readLine() )!= null) {

                if (string.contains("time=")) {

                    time[count++] = (Double.parseDouble(string
                            .substring(string.lastIndexOf("=") + 1,
                                    string.length() - 3)));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        if(count == 0){
            System.out.println("can not reach.....");
        }

        return PingHost.median(time);
        // Read the output from call
    }

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {


        System.out.println("enter the no of time u want to png");
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        System.out.println("enter the Host name you want to pingNmedian");

        String input = sc.next();
        String command = "ping -c "+String.valueOf(number) + " "+input;

        System.out.println(command);

        System.out.println("please wait......");
         double median = PingHost.pingNmedian(command,number);
        if(median != 0.0 )
            System.out.println("mediam of time taken :"+ median);
    }

}
