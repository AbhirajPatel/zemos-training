/**
 * Created by zemoso on 12/7/17.
 */

public class TestClassCasting {

     public  void upcasting (){
         Unicycle objUnicycle = new Unicycle();
         Bicycle  objBicycle = new Bicycle();
         Tricycle objTricycle = new Tricycle();

         Cycle objCycle[] = {objBicycle,objUnicycle,objTricycle};

         objCycle[0].balance();
         objCycle[1].balance();
         objCycle[2].balance();
     }
     public void downcasting () {
         //--Downcasting alwayys throw an exception ClasscastException.
         //--to avoid that we will cast like that.
         Cycle objuCycle = new Unicycle();
         Unicycle castedUnicycle = (Unicycle)objuCycle;

         Cycle objbCycle = new Bicycle();
         Bicycle castedjBycycle = (Bicycle) objbCycle;

         Cycle objTcycle = new Tricycle();
         Tricycle castedTricycle = (Tricycle) objTcycle;

        castedjBycycle.balance();
         /**
          * this will print message from the balance method define in th cycle.
          */
         //similarly
         castedUnicycle.balance();
         castedTricycle.balance();
     }

     public static void main (String[] args )
     {
         TestClassCasting objTestclass = new TestClassCasting();

         objTestclass.upcasting();
         objTestclass.downcasting();
         /**
         /*  the out put is "this is cycle class that is beacuse we have upcast the bicycle as cycle so it will print
         * the method define in the cycle*/

     }

}
