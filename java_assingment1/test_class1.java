package  abhiraj.assignment.data;

public class test_class1{
	 private int int_var;
	private char char_var;
   public void print_var(){
   	System.out.println("printing: \n" + int_var + "\n" + char_var);
   }
   public void print_local_var(){
   	 int local_int_var = 2;
   	 char local_char_var = 'd';
     /* 

     (local varialbe can't left uninitialised)
     java doest not allow the initialisation of the local variable by default , there inital value is undefiened but 
     for the member variable java assing them a default value, so local variable must be initialised other wise it will
      give compilation error. */

     System.out.println("printing: \n" + local_int_var + "\n" + local_char_var);
   }
}