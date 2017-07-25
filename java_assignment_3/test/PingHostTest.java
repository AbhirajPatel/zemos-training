import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zemoso on 25/7/17.
 */
public class PingHostTest {
    @org.junit.Test
    public void median() throws Exception {
        double[]  doubles = {2,4,3,6,7};
        PingHost pingHost = new PingHost();
     double d  =  pingHost.median(doubles);
       assertEquals(4.0 , d, 0.0);
    }

    @org.junit.Test
    public void ping() throws Exception {
        PingHost pingHost = new PingHost();
       List<String> strings = pingHost.ping("ping -c 3 google.com");
       for(String string :strings)
           System.out.println(string);
    }

}