/**
 * Created by zemoso on 11/8/17.
 */
public class Factory {
    private int value ;

    public void setValue(int value) {
        this.value = value;
    }
    public Cycle getCycle(){
        switch (value){
            case 1:
                return new UniCycle();
            case 2:
                return new BiCycle();
            case 3:
                return new TriCycle();
                default:
                    System.out.println("only  between 1 and 3");
                    System.exit(-1);
        }
        return null;
    }
}
