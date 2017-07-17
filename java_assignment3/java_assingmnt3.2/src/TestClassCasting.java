/**
 * Created by zemoso on 12/7/17.
 */

public class TestClassCasting {

     public  void upcasting (){
         Unicycle obj_unicycle = new Unicycle();
         Bicycle  obj_bicycle = new Bicycle();
         Tricycle obj_tricycle = new Tricycle();

         Cycle obj_cycle[] = {obj_bicycle,obj_unicycle,obj_tricycle};

         obj_cycle[0].balance();
         obj_cycle[1].balance();
         obj_cycle[2].balance();
/**
 * this will print the message from the overriden methods in the corresponding subclasses.
 *
 */


     }
     public void downcasting () {
         Cycle obj_cycle = new Cycle();

         Unicycle obj_unicycle = (Unicycle) obj_cycle;
         Bicycle obj_bicycle = (Bicycle) obj_cycle;
         Tricycle obj_tricycle = (Tricycle) obj_cycle;

         obj_bicycle.balance();
     }
     public static void main (String[] args )
     {
         TestClassCasting obj_testclass = new TestClassCasting();

         obj_testclass.upcasting();
         /**
         /*  the out put is "this is cycle class that is beacuse we have upcast the bicycle as cycle so it will print
         * the method define in the cycle*/

     }

}
