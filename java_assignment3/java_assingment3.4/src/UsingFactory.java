import java.util.Scanner;

/**
 * Created by zemoso on 11/8/17.
 */
public class UsingFactory {

    public static void main(String[] arg){
        Factory factory = new Factory();
        Scanner sc = new Scanner(System.in);
        int flag;
        System.out.println("enter 1 for Unicycle");
        System.out.println("enter 2 for Bi-cycle");
        System.out.println("enter 3 for Tricycle");
        try {
            flag = Integer.parseInt(sc.nextLine());
            factory.setValue(flag);
        }
        catch (NumberFormatException e){
            System.out.println("pleses enter integer between 1 to 3");
            System.exit(-1);
        }
        Cycle cycle = factory.getCycle();
        cycle.balance();
        cycle.getPrice();
        cycle.getSeller();
    }
}
