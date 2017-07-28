import static org.junit.Assert.*;

/**
 * Created by zemoso on 27/7/17.
 */
public class DateRangeFinderTest {
    @org.junit.Test
    public void dateRange() throws Exception {
        String range;
        range = DateRangeFinder.dateRange("16-07-1998" , "27-06-2017");
        assertTrue(range.equals("16-06-2017 27-06-2017"));
        range = DateRangeFinder.dateRange("04-02-2016" , "04-04-2017");
        assertTrue(range.equals("05-01-2017 06-03-2017"));
        range = DateRangeFinder.dateRange("04-05-2017" , "04-04-2017");
        assertTrue(range.equals("No range"));
        range = DateRangeFinder.dateRange("04-04-2015" , "04-04-2016");
        assertTrue(range.equals("05-03-2016 04-04-2016"));
        range = DateRangeFinder.dateRange("04-04-2015" , "15-03-2016");
        assertTrue(range.equals("05-03-2016 15-03-2016"));
    }

}