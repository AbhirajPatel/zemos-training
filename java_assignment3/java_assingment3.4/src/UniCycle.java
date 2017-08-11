/**
 * Created by zemoso on 11/8/17.
 */
public class UniCycle implements Cycle{
    private double price = 100.23 ;
    private String seller  = "Manoj Singh";
    @Override
    public void balance() {
        System.out.println("balancing Uni cycle");
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
