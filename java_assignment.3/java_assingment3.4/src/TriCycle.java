/**
 * Created by zemoso on 11/8/17.
 */
public class TriCycle implements Cycle {
    private double price = 112.23 ;
    private String seller  = "Mahesh Singh";
    @Override
    public void balance() {
        System.out.println("balancing tri cycle");
    }

    @Override
    public void getPrice() {
        System.out.println("price : " + price);
    }

    @Override
    public void getSeller() {
        System.out.println("seller name : " + seller);
    }
}
