/**
 * Created by zemoso on 11/7/17.
 */

/**
 * this is considered as the base class.
 */
public class Hamster extends Gerbil {
    Hamster(){
            System.out.println("this is a Hamster");
    }
    public void properties() {
        System.out.println("this is a Rodent-Mouse - Gerbil - Hamster");
    }
        public static void main(String arg[]){

            Rodent rodent_obj[] = new Rodent[5];

            for(int i= 0 ;i<5;i++)
            {
                rodent_obj[i] = new Rodent(Integer.toString(i));
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

