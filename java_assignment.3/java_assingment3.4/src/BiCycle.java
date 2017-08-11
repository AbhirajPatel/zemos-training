/**
 * Created by zemoso on 11/8/17.
 */
public class BiCycle implements Cycle {
    private double price = 52.23 ;
    private String seller  = "Devesh Singh";
    @Override
    public void balance() {
        System.out.println("balancing Bi cycle");
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
