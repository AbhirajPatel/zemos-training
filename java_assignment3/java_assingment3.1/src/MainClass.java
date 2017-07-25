/**
 * Created by zemoso on 25/7/17.
 */
public class MainClass {
    public static void main(String arg[]){

        Rodent rodentObj[] = new Rodent[5];

        for(int i= 0 ;i<5;i++)
        {
            rodentObj[i] = new Rodent(Integer.toString(i));
        }
            /*
            this are all rodent0    -- providing different argument to diffrent Rodent.
            this are all rodent1
            this are all rodent2
            this are all rodent3
            this are all rodent4
            */

        Hamster obj_hamster = new Hamster();
            /* the out will be  ....................
            this all are Rodent
            this is a Mouse           -- default constructor for each class will be called.
            this is a Gerbil
            this is a Hamster
              */
        obj_hamster.properties();
    }
}
