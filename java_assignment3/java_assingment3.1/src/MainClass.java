/**
 * Created by zemoso on 25/7/17.
 */

public class MainClass {
    public static void main(String arg[]){

        Rodent rodentObj[] = new Rodent[3];
        rodentObj[0] = new Mouse();
        rodentObj[1] = new Gerbil();
        rodentObj[2] = new Hamster();
        for(int i = 0; i < rodentObj.length ; i++){
            rodentObj[i].properties();
        }

    }
}
